package ua.javarush.module1.lesson7;

import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input array length: ");
        int length = scanner.nextInt();
        int[] items = new int[length];

        for (int i = 0; i < items.length; i++) {
            System.out.print("Input items[" + i + "]=");
            items[i] = scanner.nextInt();
            System.out.println();
        }
    }
}
