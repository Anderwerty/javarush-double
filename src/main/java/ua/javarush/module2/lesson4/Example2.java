package ua.javarush.module2.lesson4;

public class Example2 {
    public static void main(String[] args) {
        A.staticMethod();

        A a = null;
//        a.staticMethod();
    }
}

interface A {
    public static void staticMethod() {
        System.out.println("static method");
    }

    void method();
}

class AImpl implements A{

    @Override
    public void method() {

    }
}

final class AUtility {
    private AUtility(){

    }

    static void staticMethod() {
        System.out.println("static method");
    }
}
