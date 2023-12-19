package ua.javarush.module3.lesson16;

public class Example6 {
    public static void main(String[] args) {

    }


    public static Pet createPet(String petType) {
        switch (petType) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new IllegalArgumentException();
        }
    }

    public static Pet createPet2(String petType) {
        switch (petType) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            default:
                throw new IllegalArgumentException();
        }
    }
}

abstract class Pet {

}

class Dog extends Pet {

}

class Cat extends Pet {

}
