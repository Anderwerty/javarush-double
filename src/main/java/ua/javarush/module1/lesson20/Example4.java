package ua.javarush.module1.lesson20;

public class Example4 {
    public static void main(String[] args) {
        SingletonA.INSTANCE.method();

        SingletonB.getInstance().method();

        System.out.println(SingletonB.getInstance() == SingletonB.getInstance());

        SingletonEnum.SINGLETON.method();
    }
}

final class SingletonA {

    public static final SingletonA INSTANCE = new SingletonA();

    private SingletonA() {

    }

    public void method() {
        System.out.println("Do something...");
    }
}

final class SingletonB {
    //multithreading?
    private static SingletonB instance;

    // lazy
    public static SingletonB getInstance() {
        if (instance == null) {
            instance = new SingletonB();
        }
        return instance;
    }

    private SingletonB() {
        // do a lot ....
    }

    public void method() {
        System.out.println("Do something...");
    }
}

enum SingletonEnum{
    SINGLETON;

    public void method(){
        System.out.println("method in singleton enum");
    }
}

enum MultiTon {
    ONE, TWO;
}

//** multiton 1) not enum 2) lazy
