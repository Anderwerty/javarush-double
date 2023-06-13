package ua.javarush.module1.lesson9;

public class Example8 {
    public static void main(String[] args) {
        int value = sum(1, 1);
        System.out.println(value);

        System.out.println(concat("Hello", " word!"));
    }

    public static int sum(int a, int b) {
        int result = a + b;

        return result;
    }

    public static String concat(String a, String b) {
        return a + b;
    }
}
