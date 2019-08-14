package rpc;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author fangzongzhou
 */
public class RpcInvokeTest {

    public static void export(final Object service, int port) throws IOException {

        ExecutorService executorService = new ThreadPoolExecutor(5, 10, 10, TimeUnit.SECONDS, new LinkedBlockingQueue<>(5));

        System.out.println("Export service " + service.getClass().getName() + " on port " + port);
        ServerSocket serverSocket = new ServerSocket(port);
        while (true) {
            try {
                final Socket socket = serverSocket.accept();
                Runnable runnable = () -> {
                    ObjectInputStream objectInputStream = null;
                    ObjectOutputStream objectOutputStream= null;
                    try {
                        objectInputStream = new ObjectInputStream(socket.getInputStream());

                        String methodName = objectInputStream.readUTF();
                        Class[] parameterTypes = (Class[]) objectInputStream.readObject();
                        Object[] arguments = (Object[]) objectInputStream.readObject();
                        objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        Method method = service.getClass().getMethod(methodName, parameterTypes);
                        Object result = method.invoke(service, arguments);
                        objectOutputStream.writeObject(result);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }finally {
                        try {
                            objectInputStream.close();
                            objectOutputStream.close();
                            socket.close();
                        }
                        catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                };
                executorService.submit(runnable);

            }
            catch (Exception e) {
                e.printStackTrace();
            }finally {

            }
        }
    }

    public static <T> T refer(final Class<T> interfaceClass, final String host, final int port) {
        if (interfaceClass == null) {
            throw new IllegalArgumentException("interface class is null");
        }
        if (!interfaceClass.isInterface()) {
            throw new IllegalArgumentException("interface class must be interface" + interfaceClass.getName());
        }
        System.out.println("remote service is " + interfaceClass.getName() + " from host " + host + "port is : " + port);
        Object object = Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[] {interfaceClass}, (proxy, method, args) -> {
            Socket socket = new Socket(host, port);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());

            try {

                objectOutputStream.writeUTF(method.getName());
                objectOutputStream.writeObject(method.getParameterTypes());
                objectOutputStream.writeObject(args);
                try {
                    ObjectInputStream objectInputStream  = new ObjectInputStream(socket.getInputStream());
                    return objectInputStream.readObject();
                }finally {
                    objectOutputStream.close();
                }

            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                objectOutputStream.close();
                socket.close();

            }

            return new RuntimeException("ex error");


        });

            return (T) object;

    }



}
