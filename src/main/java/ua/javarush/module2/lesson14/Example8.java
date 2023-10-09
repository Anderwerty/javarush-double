package ua.javarush.module2.lesson14;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Example8 {
    public static void main(String[] args) {
        Random random = new Random();
        double v1 = random.nextDouble();

        ///////////////////////

        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        double v2 = threadLocalRandom.nextDouble();

        ////////////////

        double v3 = Math.random();
    }
}

class Container {
    private ThreadLocal<String> email = new ThreadLocal<>();

    public void method() {
        String generatedValue = Thread.currentThread().getName() + "@gmail.com";
        email.set(generatedValue);

        System.out.println(email.get());

    }
}
