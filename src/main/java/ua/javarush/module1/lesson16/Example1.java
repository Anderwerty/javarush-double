package ua.javarush.module1.lesson16;

public class Example1 {
    public static void main(String[] args) {
        Integer a = 1000;
        Integer b = 1000;
//        Integer.valueOf(1000)
        Integer c = new Integer(1000);

        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        Integer a1 = Integer.valueOf(1000);

    }
}
