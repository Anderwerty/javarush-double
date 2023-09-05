package ua.javarush.module2.lesson4;

public class Example7 {
    public static void main(String[] args) {
        A11 a = new A11();

        B1 b1 = a;
        B2 b2 = a;

        a.fly();
        a.swim();

        b1.fly();
//        b1.swim();

//        b2.fly();
        b2.swim();
    }
}

class A11 implements B1, B2 {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}

interface B1 {
    void fly();
}

interface B2 {
    void swim();
}
