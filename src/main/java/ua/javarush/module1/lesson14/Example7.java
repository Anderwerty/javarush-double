package ua.javarush.module1.lesson14;

import ua.javarush.module1.lesson14.EngineMaker.Engine;

public class Example7 {
    public static void main(String[] args) {
        Engine engine = new EngineMaker().new Engine();
    }
}

class EngineMaker {
    public static int makerStaticValue = 0;

    public int value = 0;

    public void staticMethod() {
        makerStaticValue++;
     /*   Engine.engineStaticValue++;*/
    }

    public void method() {
        value++;
        int value = new Engine().value;
    }

    public class Engine {
        public /*static*/ int engineStaticValue = 0;

        public int value = 0;

        public void staticMethod() {
            makerStaticValue++;
            engineStaticValue++;
        }

        public/* static*/ void method(){

        }
    }
}
