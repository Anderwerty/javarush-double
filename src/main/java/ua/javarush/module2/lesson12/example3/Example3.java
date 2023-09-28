package ua.javarush.module2.lesson12.example3;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Resources resources = new Resources();

        Producer producer = new Producer(resources);

        Consumer consumer = new Consumer(resources);

        consumer.start();
        producer.start();

        Thread.sleep(10_000);

        synchronized (resources) {
            while (true) {
                System.out.println(".....");
                Thread.sleep(300);
            }
        }

    }
}

class Resources {

    private static final int CAPACITY = 5;

    private final Object lock = new Object();
    private int counter = 0;


    // Resources.class
    public static void method() {
        // start
        synchronized (Resources.class) {
            System.out.println();
        }


        //end
    }

    public static synchronized void method2() {

    }

    public void increaseCounter() {
        synchronized (lock) {
            while (counter == CAPACITY) {
                waitSomeTime();
            }
            Thread thread = Thread.currentThread();
            ++counter;
            System.out.println("Increase counter, thread: " + thread.getName() + ", counter= " + counter);
            lock.notify();
        }

    }

    public void decreaseCounter() {
        synchronized (lock) {
            while (counter == 0) {
                waitSomeTime();
            }
            Thread thread = Thread.currentThread();
            --counter;
            System.out.println("Decrease counter, thread: " + thread.getName() + ", counter= " + counter);
            lock.notify();
        }
    }

    private static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void waitSomeTime() {
        try {
            lock.wait();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}

class Consumer extends Thread {

    private final Resources resources;


    Consumer(Resources resources) {
        this.resources = resources;
        setName("Consumer");
    }


    @Override
    public void run() {
        while (true) {
            // try to get resource monitor
            resources.decreaseCounter();
            // release resource monitor
        }
    }
}

class Producer extends Thread {
    private final Resources resources;

    Producer(Resources resources) {
        this.resources = resources;
        setName("Producer");
    }

    @Override
    public void run() {
        while (true) {
            // try to get resource monitor
            resources.increaseCounter();
            // release resource monitor
        }
    }
}
