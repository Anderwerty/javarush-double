package ua.javarush.module3.lesson18;

public class Example4 {
    public static void main(String[] args) {
System.gc();
    }
}

class Singleton {
    private static Singleton instance = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
