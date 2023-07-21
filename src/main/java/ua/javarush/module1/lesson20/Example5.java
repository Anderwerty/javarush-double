package ua.javarush.module1.lesson20;

public class Example5 {
    public static void main(String[] args) {
        int age = 2;
        if (age == 0) {
            System.out.println("age is 0");
        } else if (age == 1) {
            System.out.println("age is 1");
        } else if (age == 2) {
            System.out.println("age is 2");
        } else {
            System.out.println("......");
        }

        System.out.println("=".repeat(40));

        switch (age) {
            case 0:
                System.out.println("age is 0");
                System.out.println(" ");
                break;
            case 1:
                System.out.println("age is 1");
                break;
            case 2:
                System.out.println("age is 2");
                break;
            default:
                System.out.println("......");
                break;
        }
    }
}
