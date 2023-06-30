package ua.javarush.module1.lesson14.example6;

public class Counter {
    private static int counter = 0;

    public Counter() {
        counter++;
        System.out.println(counter);
    }

    public static void staticMethod(){
        new Counter();
    }
}
