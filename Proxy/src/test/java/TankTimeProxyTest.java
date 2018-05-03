import org.junit.Test;


public class TankTimeProxyTest {



    @Test
    public void move() {
        Tank tank=new Tank();


        TankTimeProxy tankTimeProxy = new TankTimeProxy(tank);
        tankTimeProxy.move();
    }
}