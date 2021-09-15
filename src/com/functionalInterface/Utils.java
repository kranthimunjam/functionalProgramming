package src.com.functionalInterface;

import java.util.ArrayList;

public class Utils {
    public static  ArrayList<Integer> getList(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        return list;
    }

    public static  ArrayList<Double> getDoubleList(){
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.0);
        list.add(2.0);
        list.add(3.0);
        list.add(4.0);
        list.add(5.0);
        list.add(6.0);
        return list;
    }
}
