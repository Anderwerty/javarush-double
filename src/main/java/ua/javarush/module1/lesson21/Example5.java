package ua.javarush.module1.lesson21;

public class Example5 {
    public static void main(String[] args) {


        int timeout = 1;

        try {
            process(timeout);
            System.exit(0);
        } finally {
            System.out.println("close connection");
        }

    }


    private static void process(int timeout) {
        System.out.println("processing");

        if (timeout > 100) {
            throw new RuntimeException();
        }
    }
}
