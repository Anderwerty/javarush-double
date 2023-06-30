package ua.javarush.module1.lesson14;

public class Example1 {
    public static void main(String[] args) {
        A.staticValue++;

        System.out.println(A.staticValue);

        A a3 = null;
        System.out.println(a3.staticValue);
    }
}

class A {
    public static int staticValue = 0;

    public int nonStaticValue = 0;
}
