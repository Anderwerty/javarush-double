package ua.javarush.module1.lesson11;

public class Example1 {
    public static void main(String[] args) {
        int a = 10125789;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toOctalString(a));
        System.out.println(Integer.toHexString(a));

        int b = 102;


        int c = a|b;
        int d = a&b;
        int f = a>>2;

    }
}
