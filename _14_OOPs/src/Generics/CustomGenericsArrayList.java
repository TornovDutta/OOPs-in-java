package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomGenericsArrayList<T> {
    private Object[] data;
    private int DefaultSize=10;
    private int size;

    public CustomGenericsArrayList() {
        this.data=new Object[DefaultSize];
    }


    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return data.length==size;
    }
    private void resize(){
        Object[] temp=new Object[DefaultSize*2];
        for (int i = 0; i < DefaultSize; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }


    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }
    public void print(List<? extends Number> list){
        for (int i = 0; i < size; i++) {
            System.out.print(this.data[i]+" ");
        }
    }
    public T get(int idx){
        return (T)data[idx];
    }

    public int size(){
        return size;
    }
    public void set(int idx,T val){
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
//        CustomGenericsArrayList list=new CustomGenericsArrayList();
//        list.add(12);
//        list.add(123);
//        list.add(34);
//        System.out.println(list.size());
//        list.remove();
//        System.out.println(list.get(1));
//        System.out.println(list.size());
//        list.set(1,7);
//        list.add(14567);
//        System.out.println(list.get(1));
//
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i)+" ");
//        }
//        System.out.println("\n"+list);
        CustomGenericsArrayList<Integer> list=new CustomGenericsArrayList<>();
        list.add(12);
        list.add(23);
        list.add(34);
        System.out.println(list);



    }
}
