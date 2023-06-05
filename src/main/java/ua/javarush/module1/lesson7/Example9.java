package ua.javarush.module1.lesson7;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int min2 = min;
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            if (x < min) {
                min2 = min;
                min = x;
            }
        }
        System.out.println(min);
        System.out.println(min2);
    }
}
