package ua.javarush.module3.lesson18;

public class Example2 {
    public static void main(String[] args) {
        long[] items = new long[2_000_000_000]; // heap is full. How to fix?
//        System.out.println("hello");

        System.out.println(factorial(10)); // stack is full
    }

    public static long factorial(int n) {
        return n * factorial(n - 1); // should we add here some condition
    }
}
