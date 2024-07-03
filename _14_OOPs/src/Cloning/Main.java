package Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human tornov=new Human("tornov",80);
        Human robot=(Human)tornov.clone();

        System.out.println(robot.name);
    }
}
