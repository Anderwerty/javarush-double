package ua.javarush.module1.lesson10;

public class Example5 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = a + "";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println("length: ");
        System.out.println(a.length() ==c.length());

        System.out.println(a == c.intern());
        System.out.println(a == c);


    }
}
