package ua.javarush.module2.lesson12.example2;

public class Example2 {
    public static void main(String[] args) {
        Resources resources = new Resources();

        Producer producer = new Producer(resources);

        Consumer consumer = new Consumer(resources);

        consumer.start();
        producer.start();
    }
}

class Resources {

    private static final int CAPACITY = 5;
    private int counter = 0;


    // Resources.class
    public static synchronized void  method() {
        // start


        //end
    }

    public static synchronized void method2() {

    }

    public synchronized void increaseCounter() {
        while(counter == CAPACITY){
            waitSomeTime();
        }
        Thread thread = Thread.currentThread();
        ++counter;
        System.out.println("Increase counter, thread: " + thread.getName() + ", counter= " + counter);
        notify();
    }

    public synchronized void decreaseCounter() {
        while (counter == 0){
            waitSomeTime();
        }
        Thread thread = Thread.currentThread();
        --counter;
        System.out.println("Decrease counter, thread: " + thread.getName() + ", counter= " + counter);
        notify();
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
            wait();
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
