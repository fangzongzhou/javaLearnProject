import javax.tools.JavaCompiler;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

public class Proxy {
    public static Object newProxyInstance() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        String fileName = "/Users/fangzongzhou/workspace/javaLearnProject/Proxy/src/main/java/TankTimeProxy.java";


        //compile
        JavaCompiler javaCompiler = ToolProvider.getSystemJavaCompiler();
        StandardJavaFileManager standardJavaFileManager = javaCompiler.getStandardFileManager(null, null, null);
        Iterable units = standardJavaFileManager.getJavaFileObjects(fileName);
        JavaCompiler.CompilationTask compilationTask = javaCompiler.getTask(null, standardJavaFileManager, null, null, null, units);
        compilationTask.call();
        standardJavaFileManager.close();

        //load into memory

        URLClassLoader urlClassLoader = new URLClassLoader(new URL[]{new URL("file:/" + System.getProperty("user.dir") + "/src")});
        Class c = urlClassLoader.loadClass("TankTimeProxy");
        Class proxyClass = TankTimeProxy.class;
        System.out.println(proxyClass);
        System.out.println(proxyClass.getConstructors().length);
        Constructor constructor = proxyClass.getConstructor(Moveable.class);
        Object o = constructor.newInstance(new Tank());


        return o;
    }
}
