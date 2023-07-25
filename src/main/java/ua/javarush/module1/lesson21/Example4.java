package ua.javarush.module1.lesson21;

public class Example4 {
    public static void main(String[] args) {

        try {
            method();
        } catch (Error e) {
            System.out.println("error was caught");
        }
    }


    private static void method() {
        throw new Error();
    }
}
