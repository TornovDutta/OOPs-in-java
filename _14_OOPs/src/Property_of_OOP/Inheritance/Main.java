package Property_of_OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box b1=new Box(12,34,4);
        System.out.println(b1.h+" "+b1.w+" "+b1.l);


        
        BoxWeight b2=new BoxWeight(12,34,6,78);
        System.out.println(b2.h+" "+b2.w+" "+b2.l+" "+b2.weight);
    }

}
