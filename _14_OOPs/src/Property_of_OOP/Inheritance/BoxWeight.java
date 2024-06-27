package Property_of_OOP.Inheritance;

public class BoxWeight extends Box{
    int weight;

     BoxWeight() {
    }

    BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(int h, int w, int l, int weight) {
        super(h, w, l);
        this.weight = weight;
    }
}
