package rpc;

/**
 * @author fangzongzhou
 */
public interface HelloService {

    /**
     * hello name
     * @param name userName
     * @return
     */
    String hello(String name);

    String hello(String name, Integer age);
}
