package ua.javarush.module2.lesson11;

public class Example1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start(); //myThread.run();
        myThread.start();

        System.out.println("main thread end");

        Object input = new Object();
        MyRunnable myRunnable = new MyRunnable(input);
        new Thread(myRunnable).start();
        new Thread(() -> System.out.println(" runnable as lambda")).start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread start");
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MyThread end");
    }
}


class MyRunnable implements Runnable {
    private final Object input;
    private Long result;

    MyRunnable(Object input) {
        this.input = input;
    }

    public Long getResult() {
        return result;
    }

    @Override
    public void run() {
        System.out.println(" my runnable");
        long sum =0;
        for (int i = 0; i <100000 ; i++) {
            sum+=i;
        }

        this.result = sum;
    }
}
