package Property_of_OOP.Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("start the engine");
    }

    @Override
    public void stop() {
        System.out.println("stop the engine");
    }
}
