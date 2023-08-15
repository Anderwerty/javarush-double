package ua.javarush.module1.lesson27;

public class Example1 {
    private static final int NUMBER_OF_ITERATION = 1000;

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();

        for (int i = 1; i <= NUMBER_OF_ITERATION; i++) {
            execute();
        }

        long end = System.currentTimeMillis();

        System.out.println((end - start) * 1.0 / NUMBER_OF_ITERATION + " ms");

    }

    private static void execute() throws InterruptedException {
        Thread.sleep(10);
    }
}
