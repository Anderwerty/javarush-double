package ua.javarush.module1.lesson21;

public class Example8 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("..............................");
        }
    }

    private static void method1() {
        method2();
    }

    private static void method2() {
        method3Wrapper();
    }

    private static void method3Wrapper() {
        try {
            method3();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void method3() throws Exception {
        throw new Exception();
    }

}
