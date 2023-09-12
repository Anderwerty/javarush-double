package ua.javarush.module2.lesson6;

public class Example2 {
    public static void main(String[] args) {
        MyInterface2 myInterface2 = () -> {
            System.out.println(" hello all");
            System.out.println("......");
        };

        myInterface2.method();

        MyInterface3 myInterface3 = message -> System.out.println(message);

        MyInterface4 myInterface4 = (message, times) -> {
            for (int i = 0; i < times; i++) {
                System.out.println(message);
            }
        };


        MyInterface5 myInterface5 = message -> message.toUpperCase();
        MyInterface5 myInterface51 = message -> {
            System.out.println("...........");
            return message.toUpperCase();
        };

        String name = myInterface51.method("Denys");
        System.out.println(name);


    }
}

@FunctionalInterface
interface MyInterface2 {
    void method();

      int hashCode();

      boolean equals(Object o);

      String toString();
}

@FunctionalInterface
interface MyInterface3 {
    void method(String message);
}

@FunctionalInterface
interface MyInterface4 {
    void method(String message, int times);
}


@FunctionalInterface
interface MyInterface5 {
    String method(String message);
}


class MyClass2 implements MyInterface2 {

    @Override
    public void method() {
        System.out.println(" hello all");
    }
}