package ua.javarush.module1.lesson9;

public class Example11 {
    public static void main(String[] args) {

    }

    public static String method1(int a) {
        if (a % 2 == 0) {
            return "YES";
        } else {
            return "NO";
        }
    }

    public static String method2(int a) {
        String message;
        if (a % 2 == 0) {
            message = "YES";
        } else {
            message = "NO";
        }

        return message;
    }
}
