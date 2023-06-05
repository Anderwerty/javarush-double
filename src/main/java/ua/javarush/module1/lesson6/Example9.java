package ua.javarush.module1.lesson6;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        while (true) {
            String s = console.nextLine();
            if ("exit".equalsIgnoreCase(s)) { //==
                break;
            }
        }
        System.out.println("==============================");

        while (true) {
            String s = console.nextLine();
            if ("exit".equalsIgnoreCase(s)) {
                break;
            }
        }
    }
}
