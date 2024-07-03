package Property_of_OOP.Interface;

public class Main {
    public static void main(String[] args) {
//        MainPen pen=new MainPen();
//        pen.start();
//        pen.Write();
//        car car=new car();
//        car.start();
//        car.stop();
//        Media car2=new car();
//        car2.start();
        Engine car1=new PowerEngine();
        car1.start();
        car1.stop();
        Media car2=new Player();
        car2.start();
        car2.stop();
    }
}
