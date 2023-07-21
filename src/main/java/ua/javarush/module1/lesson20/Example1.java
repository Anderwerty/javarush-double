package ua.javarush.module1.lesson20;

import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {
        System.out.println(Color.GREEN.toString());
        System.out.println(Color.GREEN.name());
        System.out.println(Color.GREEN.ordinal());

        Color green = Color.valueOf("GREEN");
//        Color green = Color.valueOf(null);

        System.out.println(green);

        Color[] values = Color.values();

        System.out.println(Arrays.toString(values));


        System.out.println(Color.GREEN == green);

        System.out.println(Color.RED.getClass());

        System.out.println(Color.GREEN instanceof Object); //Object ob = Color.GREEN;

        Object red = Color.RED;
        System.out.println(red instanceof Integer);//Integer integer = Color.RED;

    }
}

enum Color {
    RED,
    GREEN;
    // public static final Color RED = new Color("RED", 0);

    // public static final Color GREEN = new Color("GREEN", 1);


    @Override
    public String toString() {
        return "This color is " +name().toLowerCase();
    }
}