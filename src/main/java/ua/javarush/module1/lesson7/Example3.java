package ua.javarush.module1.lesson7;

public class Example3 {
    public static void main(String[] args) {
        int[] array = new int[9];

        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]=" + array[i]);
        }

        System.out.println(array.length);
    }
}
