package ua.javarush.module1.lesson11;

public class Example5 {
    public static void main(String... args) {
        for (String arg : args) {
            System.out.println(arg);
        }
        System.out.println("=".repeat(10));
        System.out.println("Main");
        method(1, 2);
    }

    public static void method(int a, int... params) {

    }

    public static void method1(int a, String b, int c) {

    }

    public static void method1(int a, String b) {
        method1(a, b, 10);
    }
}
