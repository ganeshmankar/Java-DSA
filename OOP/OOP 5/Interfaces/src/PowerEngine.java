public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power engine START!");
    }

    @Override
    public void stop() {
        System.out.println("Power engine STOP!");
    }

    @Override
    public void accelerate() {
        System.out.println("Power engine ACCELERATE!");

    }
}
