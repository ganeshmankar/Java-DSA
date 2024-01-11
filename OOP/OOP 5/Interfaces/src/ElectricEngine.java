public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine START!");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine STOP!");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine ACCELERATE!");
    }
}
