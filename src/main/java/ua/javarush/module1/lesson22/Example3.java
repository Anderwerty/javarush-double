package ua.javarush.module1.lesson22;

public class Example3 {

    public static void main(String[] args) {
        try {
            method1(false);
        } catch (RuntimeException e){
            e.printStackTrace();
        }

    }


    private static void method1(boolean isWork) {
        System.out.println("method 1");


        if (isWork) {
            System.out.println("working");
        } else {
            method2();
        }
    }

    private static void method2() {
        System.out.println("method 2");

        throw new IllegalArgumentException();
    }
}
