package ua.javarush.module1.lesson9;

public class Example4 {
    public static void main(String[] args) {
        String hi = "Hi";
        printMessage(hi);
        printMessageSeveralTimes("Hello", 5);
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void printMessageSeveralTimes(String message, int times) {
        for (int i = 1; i <= times; i++) {
            printMessage(message);
        }
    }
}
