package ua.javarush.module1.lesson19;

import java.util.LinkedList;

public class Example1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        long start = System.currentTimeMillis();
        list.add("A");
        long end = System.currentTimeMillis();
        list.add("B");

        list.add(4, "C");
        System.out.println(list.size());
        System.out.println(list);
    }
}
