package ua.javarush.module3.lesson19;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Example5 {
}

class ContainerA {

    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void method() {
        try {
            lock.lock();


        } finally {
            lock.unlock();
        }

    }
}
