package Cloning;

public class Human implements Cloneable {
    String name;
    int age;
    int[] arr;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.arr=new int[]{3,4,5,6,7,1};
    }

    //shallow copy
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    //Deep copy
    public Object clone() throws CloneNotSupportedException {
        Human twin = (Human) super.clone(); // Shallow copy

        // Creating a new array for the deep copy
        twin.arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}
