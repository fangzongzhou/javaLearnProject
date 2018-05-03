public class TankTimeProxy implements Moveable {
    private Moveable moveable;

    public TankTimeProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    public TankTimeProxy() {

    }

    @Override
    public void move() {
        long startTime = System.currentTimeMillis();

        moveable.move();
        System.out.println(System.currentTimeMillis() - startTime);
    }

    @Override
    public void stop() {
        long startTime = System.currentTimeMillis();

        moveable.stop();
        System.out.println(System.currentTimeMillis() - startTime);

    }
}
