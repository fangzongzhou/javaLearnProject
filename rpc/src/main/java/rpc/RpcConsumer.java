package rpc;

public class RpcConsumer {
    public static void main(String[] args) throws InterruptedException {
        HelloService helloService = RpcInvokeTest.refer(HelloService.class, "127.0.0.1", 1234);
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String hello = helloService.hello("world");
            System.out.println(hello);
            String ageHello = helloService.hello("fzz", 24);
            System.out.println(ageHello);
            Thread.sleep(1000);
        }
    }
}
