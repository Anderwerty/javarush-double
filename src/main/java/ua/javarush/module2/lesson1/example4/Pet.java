package ua.javarush.module2.lesson1.example4;

import java.util.Scanner;

class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 -cat, 2-dog");
        int choose = scanner.nextInt();

        Pet pet;

        if (choose == 1) {
            pet = new Cat();
        } else {
            pet = new Dog();
        }

        pet.say();
        System.out.println(pet.name);
        System.out.println("====");
        System.out.println(pet.getName());
//        pet.say2();


    }
}

public class Pet {
    String name = "Pet";

    public void say() {

    }

    public String getName() {
        return this.name;
    }

    //    public void say2(){
//
//    }
}

class Cat extends Pet {
    String name = "Cat";

    public Cat() {
        super();
    }

    @Override
    public void say() {
        System.out.println("mia-mia");
        System.out.println("cat name: " + name);
        System.out.println("cat name from super class: " + super.name);

        super.say();
    }

//    @Override
//    public String getName() {
//        return name;
//    }

    public void say2() {
        System.out.println("mia-mia-mia");
    }
}

class Dog extends Pet {


    @Override
    public void say() {
        System.out.println("gaf-gaf");
    }

    public void say2() {
        System.out.println("gaf-gaf-gaf");
    }
}
