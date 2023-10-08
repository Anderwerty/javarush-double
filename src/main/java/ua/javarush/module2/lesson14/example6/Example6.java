package ua.javarush.module2.lesson14.example6;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Example6 {
    public static void main(String[] args) {
        Resources resources = new Resources();

        Producer producer = new Producer(resources);

        Consumer consumer = new Consumer(resources);

        consumer.start();
        producer.start();
    }
}

class Resources {

    private static final int MAX_CAPACITY = 5;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition  condition = lock.newCondition();
    private int counter = 0;

    public synchronized void increaseCounter() {
        lock.lock();
        try {
            while (counter == MAX_CAPACITY){
//                this.wait();
                condition.await();
            }
            Thread thread = Thread.currentThread();
            ++counter;
            System.out.println("Increase counter, thread: " + thread.getName() + ", counter= " + counter);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
//            this.notify();
            condition.signal();
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


