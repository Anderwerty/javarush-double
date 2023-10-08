package ua.javarush.module2.lesson14;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Example3 {
    public static void main(String[] args) {

    }

    ReentrantLock lock = new ReentrantLock();

    // CAS
    // monitor (boolean, thread) ---> // monitor(boolean, thread, counter)
    public synchronized void method1() {
        synchronized (this) {
            synchronized (this) {
                System.out.println();
            }
        }
    }

    public void method2() {
        lock.lock();
        try {
        } finally {
            unlock();
        }
    }


    public void unlock() {
        System.out.println(".........");

        lock.unlock();
    }

    public void methodWithTryLock() throws InterruptedException {
        boolean isLocked = lock.tryLock(10, TimeUnit.SECONDS);

        if (isLocked) {
            try {
            } finally {
                lock.unlock();
            }
        }
    }
}
