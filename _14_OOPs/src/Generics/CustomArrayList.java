package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private int DefaultSize=10;
    private int size;

    public CustomArrayList() {
        this.data=new int[DefaultSize];
    }


    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return data.length==size;
    }
    private void resize(){
        int[] temp=new int[DefaultSize*2];
        for (int i = 0; i < DefaultSize; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }


    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int get(int idx){
        return data[idx];
    }

    public int size(){
        return size;
    }
    public void set(int idx,int val){
        data[idx]=val;

    }


    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", DefaultSize=" + DefaultSize +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>();
        CustomArrayList list=new CustomArrayList();
        list.add(12);
        list.add(123);
        list.add(34);
        System.out.println(list.size());
        list.remove();
        System.out.println(list.get(1));
        System.out.println(list.size());
        list.set(1,7);
        list.add(14567);
        System.out.println(list.get(1));


        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }


        System.out.println("\n"+list);
    }
}
