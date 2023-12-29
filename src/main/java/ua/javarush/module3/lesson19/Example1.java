package ua.javarush.module3.lesson19;

public class Example1 {
    public static void main(String[] args) {

    }
}

class Container {

    private volatile int value;
    private final Object lock = new Object();

// CAS = compare and swap
    public void method(int newValue) {
        synchronized (lock) {
            if (value % 2 == 0) {
                value = newValue;
            } else {
                value = value + newValue;
            }
        }
    }
}
