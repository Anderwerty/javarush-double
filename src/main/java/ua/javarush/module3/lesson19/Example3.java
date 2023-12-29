package ua.javarush.module3.lesson19;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Example3 {
    public static void main(String[] args) throws Exception {
        final Semaphore semaphore = new Semaphore(10);

        for (int i = 0; i < 10; i++) {
            TimeUnit.SECONDS.sleep(1);
            new Ship(semaphore).start();
        }
    }
}

// [*,*,*,*]--> [*,*,*,]

class Ship extends Thread {

    private static int counter = 0;
    private final Semaphore semaphore;
    private final int id;

    Ship(Semaphore semaphore) {
        this.semaphore = semaphore;
        this.id = ++counter;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();
            Thread.sleep(1000);
            System.out.println("Ship " + id + " is parking");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }


    }
}
