package ua.javarush.module3.lesson16;

public class Example5 {
}

enum ExampleSingleton {
    INSTANCE();

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


class SingletonClass {

    private static SingletonClass instance;

    private static final Object LOCK = new Object();

    private SingletonClass() {

    }


    private int value;

    public static SingletonClass getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    SingletonClass temp = new SingletonClass();
                    temp.value = 100;
                    instance = temp;
                }
            }
        }

        return instance;
    }
}