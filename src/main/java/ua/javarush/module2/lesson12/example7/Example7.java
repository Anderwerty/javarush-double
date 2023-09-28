package ua.javarush.module2.lesson12.example7;

public class Example7 {
    public static void main(String[] args) throws InterruptedException {
        MyTread myTread = new MyTread();
        myTread.setDaemon(true);

        myTread.start();
        myTread.join();

        Thread.yield();
        Thread.sleep(1_000);
    }
}

class MyTread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("*****");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
