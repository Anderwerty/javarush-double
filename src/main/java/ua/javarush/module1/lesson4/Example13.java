package ua.javarush.module1.lesson4;

public class Example13 {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        boolean isNotEqual1 = a != b;
        boolean isNotEqual2 = !(a == b);

        System.out.println(isNotEqual1);
        System.out.println(isNotEqual2);
    }
}
