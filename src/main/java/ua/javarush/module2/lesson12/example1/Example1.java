package ua.javarush.module2.lesson12.example1;

public class Example1 {
    public static void main(String[] args) {
        Resources resources = new Resources();

        Producer producer = new Producer(resources);

        Consumer consumer = new Consumer(resources);

        consumer.start();
        producer.start();
    }
}

class Resources {
    private int counter = 0;

    public synchronized void increaseCounter() {
        Thread thread = Thread.currentThread();
        // String.format()
        ++counter;
        System.out.println("Increase counter, thread: " + thread.getName() + ", counter= " + counter);
    }

    public synchronized void decreaseCounter() {
        Thread thread = Thread.currentThread();
        --counter;
        System.out.println("Decrease counter, thread: " + thread.getName() + ", counter= " + counter);
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
