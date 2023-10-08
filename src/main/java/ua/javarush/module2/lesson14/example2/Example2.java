package ua.javarush.module2.lesson14.example2;

import java.util.concurrent.locks.ReentrantLock;

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

    private final ReentrantLock lock = new ReentrantLock();
    private int counter = 0;

    public void increaseCounter() {
        lock.lock();
        try {
            Thread thread = Thread.currentThread();
            ++counter;
            System.out.println("Increase counter, thread: " + thread.getName() + ", counter= " + counter);
        } finally {
            lock.unlock();
        }
    }

    public void decreaseCounter() {
        lock.lock();
        try {
            Thread thread = Thread.currentThread();
            --counter;
            System.out.println("Decrease counter, thread: " + thread.getName() + ", counter= " + counter);
        } finally {
            lock.unlock();
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
            resources.decreaseCounter();
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


