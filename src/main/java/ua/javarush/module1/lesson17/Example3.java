package ua.javarush.module1.lesson17;

import java.util.HashSet;
import java.util.Iterator;

public class Example3 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        Iterator<Integer> iterator = integers.iterator();


//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        System.out.println(iterator.next());
        iterator.remove();

        System.out.println(integers.size());
    }
}
