package ua.javarush.module1.lesson12;

import java.text.DecimalFormat;

public class Example4 {
    public static void main(String[] args) {
        double a = 1.0E02; // 1.0*10^+2

        int i = Integer.MAX_VALUE - 3;

        float f = i;

        System.out.println(i == f);

        System.out.println("int:" + i);
        System.out.println("float:" + new DecimalFormat("#############.").format(f));

    }
}
