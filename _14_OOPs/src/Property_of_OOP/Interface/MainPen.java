package Property_of_OOP.Interface;
public class MainPen  implements Pen,BallPen{
    @Override
    public void start() {
        System.out.println("start write using pen");
    }

    @Override
    public void Write() {
        System.out.println("start write suing ball pen");
    }
}
