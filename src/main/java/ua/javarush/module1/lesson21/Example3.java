package ua.javarush.module1.lesson21;

public class Example3 {
    public static void main(String[] args) {
        int division = 100;
        int divisor = 0;

        if (divisor == 0) {
            throw new RuntimeException("Divisor is zero");
        } else {
            System.out.println("Result: " + (division / divisor));
        }

    }
}
