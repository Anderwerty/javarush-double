package ua.javarush.module1.lesson12;

public class Example1 {
    public static void main(String[] args) {
        double a = 1000000.0;
        double b = 0.0;

        double c = a / b;

        System.out.println(c == Double.POSITIVE_INFINITY); // true

        double d = c * 0.00000000000000000000000000000001;
        // 10^1000 * 10^-100 =10^900
        //10^100*10^-1000=

        System.out.println(d);

    }

}
