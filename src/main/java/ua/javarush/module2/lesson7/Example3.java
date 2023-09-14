package ua.javarush.module2.lesson7;

import java.util.Objects;

public class Example3 {
    public static void main(String[] args) {
        Cat cat = new Cat("A");
        Dog dog = new Dog("A");


        System.out.println(cat.equals(dog));
    }
}

class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            System.out.println("classes not the same");
            return false;
        }
        Pet pet = (Pet) o;

//        if (!(o instanceof Pet)) {
//            return false;
//        }
//        Pet pet = (Pet) o;

        return Objects.equals(name, pet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
}

class Dog extends Pet {

    public Dog(String name) {
        super(name);
    }
}