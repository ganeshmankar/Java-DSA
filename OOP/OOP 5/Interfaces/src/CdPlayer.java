public class CdPlayer implements Media{
    @Override
    public void start(){
        System.out.println("Music START!");
    }
    @Override
    public void stop(){
        System.out.println("Music STOP!");
    }
}
