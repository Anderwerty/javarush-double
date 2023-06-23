package ua.javarush.module1.lesson12;

public class Example6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 1;
        cat.name = "Tom";

        Cat cat1 = new Cat();
        cat1.age = 2;
        cat1.name = "Myrchuk";

        cat.age++;

        cat = cat1;
        cat = null;

    }
}

class Cat {
    String name;
    int age;
}

