package ua.javarush.module1.lesson9;

import java.util.Arrays;
import java.lang.Math;

public class Example12 {
    public static void main(String[] args) {
        A.method();
        int max = Math.max(1, -1);
        System.out.println(max);

        System.out.println("=================");
        int[] items = {1,2,3};

        System.out.println(items);
        System.out.println(Arrays.toString(items));
    }
}

class A{
    public static void method(){
        System.out.println("static method from class A");
    }
}


