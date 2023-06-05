package ua.javarush.module1.lesson7;

public class Example1 {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);

        intArray[0] = 1000;
        intArray[2] = 1002;
        System.out.println("========================");
        System.out.println(intArray[0]);
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
    }
}
