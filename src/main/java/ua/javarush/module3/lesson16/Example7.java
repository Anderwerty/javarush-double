package ua.javarush.module3.lesson16;

public class Example7 {
    public static void main(String[] args) {

    }
}

interface CarFactory{
    Sedan createSedan();
    Coupe createCoupe();
}

class BMWCarFactory implements CarFactory{

    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BMWCoupe();
    }
}

class Sedan{}
class Coupe{}

class BMWSedan extends Sedan{

}

class BMWCoupe extends Coupe{

}
