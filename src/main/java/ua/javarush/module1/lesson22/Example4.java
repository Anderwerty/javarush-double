package ua.javarush.module1.lesson22;

public class Example4 {
    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        System.out.println("Hello");
        boolean isThrown = true;
        if (isThrown) {
            throw new RuntimeException("exception!!!");
        }

        System.out.println("end");

    }
}

class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("*******************************************");
        System.err.print("Exception in thread " + t.getName() + " ");
        e.printStackTrace();
        System.out.println("*******************************************");
    }
}
