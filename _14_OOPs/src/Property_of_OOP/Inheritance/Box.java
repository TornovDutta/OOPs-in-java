package Property_of_OOP.Inheritance;

public class Box {
    int h;
    int w;
    int l;

    public Box() {
    }
    Box(int h,int w,int l){
        this.h=h;
        this.w=w;
        this.l=l;
    }

    Box(Box other){
        h=other.h;
        w=other.w;
        l=other.l;
    }
}
