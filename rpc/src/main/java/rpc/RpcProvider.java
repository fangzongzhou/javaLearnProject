package rpc;

import java.io.IOException;

/**
 * @author fangzongzhou
 */
public class RpcProvider {
    public static void main(String[] args) throws IOException {
        HelloService helloService = new HelloServiceImpl();
        RpcInvokeTest.export(helloService,1234 );
    }
}
