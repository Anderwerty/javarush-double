package ua.javarush.module2.lesson4;

public class Example5 {
    public static void main(String[] args) {

    }
}

interface A1 {
    void printMessage(String message);

    default void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            printMessage(message);
            staticMethod();
        }
    }

    // from java 11?
    private static void staticMethod() {
        System.out.println("............");
    }
}

class ClassA1 implements A1 {

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

/*
    @Override
    public void printMessage(String message, int times) {

    }

 */
}
