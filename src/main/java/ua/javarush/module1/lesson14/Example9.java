package ua.javarush.module1.lesson14;

public class Example9 {
    public static void main(String[] args) {
        new C();
        System.out.println("=".repeat(10));
        new C();
    }
}

class C {
    public static final int INT_VALUE;
    static int staticValue = 0;

    static {
        INT_VALUE = 100;
        staticValue = 100;
        System.out.println("static block -1");
    }

    static {
        staticValue = 1000;
        System.out.println("static block -2");

    }

    private int value;

    {
        value = 0;
        System.out.println("non static block -1");
    }

    public C() {
        System.out.println("C constructor");
    }

    {
        System.out.println("non static block -2");
    }
}
