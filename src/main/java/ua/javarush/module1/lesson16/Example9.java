package ua.javarush.module1.lesson16;

import java.util.ArrayList;

public class Example9 {
    public static void main(String[] args) {
        var item = 10;
        var cat = new Cat();

        System.out.println(cat.getClass());

        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        System.out.println("size: " + integers.size());

        for (var integer : integers) {
            System.out.println(integer);
        }

    }
}

class Cat {
}
