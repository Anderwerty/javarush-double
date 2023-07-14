package ua.javarush.module1.lesson17.part1vrsion2;

public class Example1 {
}

interface A {
    void method();
}

interface B extends A{
    void methodB();
}

class AImpl implements A {

    @Override
    public void method() {
        System.out.println("method");
    }
}
