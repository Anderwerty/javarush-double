package ua.javarush.module2.lesson12.example5;

public class Example5 {
    public static void main(String[] args) {

    }
}

class Singleton {
    private static final Object LOCK = new Object();

    private static Singleton instance;

    private int value;

    private Singleton() {

    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    //****
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (LOCK) {
                if (instance == null) {
                    Singleton temp = new Singleton();
                    temp.setValue(5);
                    instance = temp;
                }
            }
        }

        return instance;


//        synchronized (LOCK) {
//            if (instance == null) {
//                instance = new Singleton();
//            }
//            return instance;
//        }
    }
}
