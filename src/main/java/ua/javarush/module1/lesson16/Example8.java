package ua.javarush.module1.lesson16;

import java.util.ArrayList;

public class Example8 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(0, 100);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("size: " + list.size());

        System.out.println("=".repeat(25));

        list.set(0, 1000);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("size: " + list.size());

        System.out.println("=".repeat(25));

        list.remove(Integer.valueOf(100));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println("size: " + list.size());


        System.out.println("Loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
