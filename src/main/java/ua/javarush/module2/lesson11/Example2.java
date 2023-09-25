package ua.javarush.module2.lesson11;

public class Example2 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getPriority());
        MyThread2 myThread2 = new MyThread2();
        myThread2.setName("my thread");
        myThread2.setPriority(10);
        myThread2.start();
        myThread2.setDaemon(true);

        Thread.sleep(2_000);
        System.out.println("main thread end");
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread name: " + getName());
        System.out.println("Thread priority: " + getPriority());
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("My tread end");
        new MyThread2().start();
    }
}


