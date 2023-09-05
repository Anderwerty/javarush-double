package ua.javarush.module2.lesson4;

public class Example9 {
}

interface AvailableToSwim {
    void swim();
}

interface AvailableToFly{
    void fly();
}

interface AvailableToSwimAndFly extends AvailableToFly, AvailableToSwim{
    void say();
}

class MyClassA implements AvailableToSwimAndFly{

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void say() {

    }
}
