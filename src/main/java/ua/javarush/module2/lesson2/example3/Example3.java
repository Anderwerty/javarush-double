package ua.javarush.module2.lesson2.example3;

public class Example3 {
}


class A {
    public void method() {
        System.out.println("A");
    }
}

abstract class B extends A {
    abstract public void method();
}

class C extends B{

    @Override
    public void method() {

    }
}