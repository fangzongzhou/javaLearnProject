import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ProxyTest {

    @Test
    public void newProxyInstance() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Moveable moveable =(Moveable)Proxy.newProxyInstance();
        moveable.move();
    }
}