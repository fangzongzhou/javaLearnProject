package rpc;

/**
 * @author fangzongzhou
 */
public class HelloServiceImpl implements HelloService{


    @Override
    public String hello(String name) {
        return "hello "+name;
    }

    @Override
    public String hello(String name, Integer age) {
        return "hello "+ name +" age "+age;
    }
}
