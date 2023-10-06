package ua.javarush.module2.lesson13;

public class Example2 {
    public static void main(String[] args) {

    }
}

class FabricMethods {

    // factory-method
    public static A create(int value){
        if(value > 200){
            return new B1();
        } else {
            return new B2();
        }
    }
}

abstract class A{

}

class B1 extends A{

}

class B2 extends A{

}

