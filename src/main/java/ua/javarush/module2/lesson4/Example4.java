package ua.javarush.module2.lesson4;

public class Example4 {
    public static void main(String[] args) {
        System.out.println(A.VALUE);
//        A.VALUE = 100;
    }


    interface A {
        int VALUE = 10;
        String STRING_VALUE = "T...";
    }
}
