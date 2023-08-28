package ua.javarush.module2.lesson1.example3;

class Example3 {
    public static void main(String[] args) {
        Pet cat = new Cat();
//        cat = new String();
        cat = new Dog();

        Pet[] pets = {cat, new Cat(), new Dog()};


        for (Pet pet : pets) {
            pet.say();
        }

        System.out.println("=============");

        Pet dog = new Dog(); // new Cat();
        dog.say();
        ((Dog)dog).say2();
    }
}

public class Pet {

    public void say() {
        System.out.println("pet");
    }

//    public void say2(){
//
//    }
}

class Cat extends Pet {
//    @Override
//    public void say() {
//        System.out.println("mia-mia");
//    }
}

class Dog extends Pet {


    @Override
    public void say() {
        System.out.println("gaf-gaf");
    }

    public void say2(){
        System.out.println("gaf-gaf-gaf");
    }
}
