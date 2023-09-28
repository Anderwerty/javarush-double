package ua.javarush.module2.lesson12.example4;

public class Example4 {
    public static void main(String[] args) {

    }
}

class Singleton {
    private static final Object LOCK = new Object();

    private static Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if(instance == null){
            synchronized (LOCK) {
                if (instance == null) {
                    instance = new Singleton();
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
