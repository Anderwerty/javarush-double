package ua.javarush.module2.lesson13;

public class Example1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
    }
}

class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println("thread is working");
    }
}
