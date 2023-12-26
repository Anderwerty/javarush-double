package ua.javarush.module3.lesson18;

public class Example3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.b = b;
        b.a = a;
    }
}

class A {
    public B b;
}

class B {
    public A a;
}