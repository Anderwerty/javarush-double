package ua.javarush.module1.lesson19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, -3, 100, 0, 10);

        System.out.println(integers.size());

//        integers.add(2000); exception

        System.out.println(integers.getClass());
        System.out.println(new ArrayList<>().getClass());
    }
}
