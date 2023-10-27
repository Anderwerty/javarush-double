package ua.javarush.module2.project.example2.domain.animal;

import ua.javarush.module2.project.example2.domain.Location;

public class Dog extends Animal {
    public Dog() {
        super(null);
    }

    @Override
    public void eat(Location location) {

    }

    @Override
    public void increase(Location location) {

        location.lock.lock();
        boolean shouldBEIncreased = true; // max, healthpoints, random
        if (shouldBEIncreased) {

            Dog dog = new Dog();

            location.addAnimalToLocation(dog);
        }
        location.lock.unlock();
    }
}
