package ua.javarush.module2.lesson13;

import java.util.concurrent.Callable;

public class Example5 {
    public static void main(String[] args) {

    }
}

class MyCallable implements Callable<Void>{

    @Override
    public Void call() throws Exception {
        System.out.println("......");
        return null;
    }
}
