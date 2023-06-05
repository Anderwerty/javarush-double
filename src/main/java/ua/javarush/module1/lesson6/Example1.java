package ua.javarush.module1.lesson6;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number: "); // [1, 4]
        int number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Hello");
        } else if (number == 2) {
            System.out.println("Hello");
            System.out.println("Hello");
        } else if (number == 3) {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        } else if (number == 4) {
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
            System.out.println("Hello");
        }
    }
}
