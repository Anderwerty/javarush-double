package ua.javarush.module1.lesson17;

import java.util.HashSet;
import java.util.Iterator;

public class Example4 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Iterator<Integer> iterator = integers.iterator();

        integers.add(10);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
