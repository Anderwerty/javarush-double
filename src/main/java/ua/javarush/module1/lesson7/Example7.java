package ua.javarush.module1.lesson7;

public class Example7 {
    public static void main(String[] args) {
        String[] items = new String[4];
        items[0] = "Hello";
        items = new String[5];

        for (int i = items.length - 1; i >= 0; i--) {
            System.out.println(items[i]);
        }
    }
}
