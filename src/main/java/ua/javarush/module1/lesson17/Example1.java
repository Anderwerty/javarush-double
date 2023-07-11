package ua.javarush.module1.lesson17;

import java.util.ArrayList;
import java.util.HashSet;

public class Example1 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(new Integer(1));
        integers.add(2);
        integers.add(null);

        System.out.println(integers.size());


        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(null);
        System.out.println(integerList.size());
    }
}
