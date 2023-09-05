package ua.javarush.module2.lesson4;

public class Example10 {
    public static void main(String[] args) {
        new C1().method();
    }
}

class C1  implements I2, I1{

    @Override
    public void method() {
        I1.super.method();
    }
}

interface I1 {
    default void method() {
        System.out.println("1");
    }
}

interface I2 {
    /*default*/ void method(); /*{
        System.out.println("2");
    }*/
}
