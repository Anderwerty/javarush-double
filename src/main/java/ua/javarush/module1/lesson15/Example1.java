package ua.javarush.module1.lesson15;

public class Example1 {
    public static void main(String[] args) {
        new Cat("Tom");

        boolean isWorking = true;
        while (isWorking) {
            System.out.println("....");
        }
        System.out.println("End");
    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }
}
