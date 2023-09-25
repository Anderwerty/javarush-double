package ua.javarush.module2.lesson11;

public class Example4 {
    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        Thread.sleep(10_000);
        clockThread.interrupt();
        Thread.sleep(1000);
        System.out.println();
    }
}

class Clock implements Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();
        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                current.interrupt();
            }
            System.out.println("Tik");
        }

        System.out.println("======================");
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        System.out.println("======================");

    }
}
