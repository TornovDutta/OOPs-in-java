package Property_of_OOP.Interface;

public class Player implements Media{
    @Override
    public void start() {
        System.out.println("start the media");
    }

    @Override
    public void stop() {
        System.out.println("stop the media");
    }
}
