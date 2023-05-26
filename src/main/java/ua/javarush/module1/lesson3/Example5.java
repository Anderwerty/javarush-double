package ua.javarush.module1.lesson3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int a = 1;


        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age");
        String age = scanner.nextLine();
        // int --> nextInt()
        // string --> next() reads just one element
        // string ---> nextLine() reads full line
        // next() vs nextLine() ??

        System.out.println("Your age is " + age);
    }
}
