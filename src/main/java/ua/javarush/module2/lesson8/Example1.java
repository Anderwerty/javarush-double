package ua.javarush.module2.lesson8;

public class Example1 {
    public static void main(String[] args) {
        new B();
    }
}

class A extends Object {
    public A() {
        // super(...) this(...)
        super();
        System.out.println("constructor A");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("constructor B");
    }

    public B(String message){

    }
}
