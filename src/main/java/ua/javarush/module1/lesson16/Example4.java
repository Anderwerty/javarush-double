package ua.javarush.module1.lesson16;

public class Example4 {
    public static void main(String[] args) {
        Integer a = 128;
        Integer b = 128;

        //-128 127
        System.out.println(a.equals(b));
        System.out.println(a == b);
    }
}
