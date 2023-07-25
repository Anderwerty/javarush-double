package ua.javarush.module1.lesson21;

public class Example7 {

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("..............................");
        }
    }

    private static void method1() throws Exception {
        method2();
    }

    private static void method2() throws Exception {
        method3();
    }

    private static void method3() throws Exception {
        throw new Exception();
    }


}
