package ua.javarush.module1.lesson17.part1vrsion2;

import java.util.ArrayList;
import java.util.HashSet;

public class Example2 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        integers.add(new Integer(1));
        integers.add(2);
        integers.add(new Integer(1));

        System.out.println(integers.size());

        ArrayList<Integer> integers2 = new ArrayList<>();
        integers2.add(new Integer(1));
        integers2.add(2);
        integers2.add(new Integer(1));
        System.out.println(integers2.size());
    }
}
