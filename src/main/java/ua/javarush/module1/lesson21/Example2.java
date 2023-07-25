package ua.javarush.module1.lesson21;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            int age = scanner.nextInt();
            validate(age);
        }  catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static void validate(int age) throws Exception {
        if (age < 18) {
            throw new Exception();
        }
    }
}
