package ua.javarush.module2.lesson12.example8;

public class Example9 {
    public static void main(String[] args) {
        Container container = new Container();
        MyThread myThread = new MyThread(container);
        myThread.start();
    }
}

class MyThread extends Thread{
    private final Container container;

    MyThread(Container container) {
        this.container = container;
    }

    @Override
    public void run() {
        container.method();
    }
}

class Container{

    // synchronized by this
    // boolean --> thread(_), counter = 0
    public synchronized void method(){

        System.out.println("start");
        synchronized (this){
            System.out.println("....");
        }

        System.out.println("end");
    }
}
