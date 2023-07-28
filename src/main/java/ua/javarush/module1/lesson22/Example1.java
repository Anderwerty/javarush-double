package ua.javarush.module1.lesson22;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input your age: ");
        int age = scanner.nextInt();
        validateAge(age);
    }

    public static void validateAge(int age) {
        if (age < 18) {
            throw new AgeLimitationException();
        }
    }
}

class AgeLimitationException extends RuntimeException {
    public AgeLimitationException() {
    }


    public AgeLimitationException(String message) {
        super(message);
    }

    public AgeLimitationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgeLimitationException(Throwable cause) {
        super(cause);
    }

    public AgeLimitationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
