package ua.javarush.module2.lesson11;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        MyThread3 myThread3 = new MyThread3();
        myThread3.start();

        Thread.sleep(2100);

        System.out.println("try to stop my tread3");
        myThread3.setWorking(false);
    }
}

class MyThread3 extends Thread {

    private boolean isWorking = true;

    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    @Override
    public void run() {
        int counter = 0;
        try {
            while (isWorking) {
                System.out.println("Working....." +(++counter));
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {

        }

    }
}
