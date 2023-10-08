package ua.javarush.module2.lesson14.example1;

import java.util.concurrent.TimeUnit;

public class Example1 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            while (true) {
                String name = Thread.currentThread().getName();
                System.out.println("Thread " + name +" is working ....");
//                sleepForSomeSeconds(2);
            }
        };

        Thread thread1 = new Thread(runnable, "my thread - 1");
        Thread thread2 = new Thread(runnable, "my thread - 2");

        thread1.start();
        thread2.start();

        sleepForSomeSeconds(20);

    }

    private static void sleepForSomeSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
