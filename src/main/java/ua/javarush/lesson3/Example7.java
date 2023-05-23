package ua.javarush.lesson3;

public class Example7 {
    public static void main(String[] args) {
        int a = -9;
        double b = 0.0000000000000000000000000;
        // 9/0.000000000000000000000000000000001= 9*10^20
        System.out.println("a+b=" + (a+b));
        System.out.println("a-b=" + (a-b));
        System.out.println("a*b=" + (a * b));
        System.out.println("a/b=" + (a / b));
        System.out.println("a%b=" + (a % b));
    }
}