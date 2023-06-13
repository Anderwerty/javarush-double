package ua.javarush.module1.lesson9;

public class Example7 {
    public static void main(String[] args) {
        int[] a = {1, 2};
        int[] b = a;
        int [] c= a;

        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
        a = new int[]{100,34};
        System.out.println("================");
        System.out.println(c);
        System.out.println(b);
        System.out.println(a);
    }
}
