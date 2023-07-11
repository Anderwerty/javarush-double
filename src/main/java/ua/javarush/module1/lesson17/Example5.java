package ua.javarush.module1.lesson17;

import java.util.HashSet;

public class Example5 {
    public static void main(String[] args) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }

        int a = 0;
        for (Integer integer : integers) { // for in forEach style
            if (a == 0) {
                integers.add(10);
                a++;
            }
            System.out.println(integer);
        }
    }
}
