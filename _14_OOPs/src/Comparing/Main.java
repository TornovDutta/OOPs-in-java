package Comparing;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(12,7.66f);
        Student tornov=new Student(1,8.91f);


        if(kunal.compareTo(tornov)<0){
            System.out.println("Tornov is the king ");
            System.out.println(kunal.compareTo(tornov));
        }
    }
}
