package ua.javarush.module1.lesson16;

public class Example {
    public static void main(String[] args) {
        new B();
    }
}

class A {

    A() {
        System.out.println("A without parmeters");
    }

    A(String message){
        super();
        System.out.println("..........");
        System.out.println(message);
        System.out.println("..........");
    }

}

class B extends A {
    B() {
        super("Hello");
        System.out.println("ddd");
    }
}
