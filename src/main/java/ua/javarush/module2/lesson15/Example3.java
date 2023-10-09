package ua.javarush.module2.lesson15;

public class Example3 {
    public static void main(String[] args) {
        System.out.println(B.VALUE);
        System.out.println(C.VALUE);
        System.out.println(Impl.VALUE);

        System.out.println("============");

        A a = null;
        C c = null;
        Impl impl = null;
        System.out.println(a.VALUE);
        System.out.println(c.VALUE);
        System.out.println(impl.VALUE);
    }
}

class A {
    public static final int VALUE = 1;
}

class B extends A {
    public static final int VALUE = 10;
}

class C extends A {

}


interface I {
    int VALUE = 10;
}

class Impl implements I {

}
