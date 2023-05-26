package ua.javarush.module1.lesson4;

public class Example16 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b); // true
        System.out.println(a == c); //false
        System.out.println("=========");
        // Object
        System.out.println(a.equals(b)); //true
        System.out.println(a.equals(c)); // true
    }
}
