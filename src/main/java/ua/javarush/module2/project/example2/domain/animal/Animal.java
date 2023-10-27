package ua.javarush.module2.project.example2.domain.animal;

import ua.javarush.module2.project.example2.domain.Coordinate;
import ua.javarush.module2.project.example2.domain.Location;

//
public abstract class Animal {
    private int weight; // private int healthPoints; [0, 100]
    private char image;

    private boolean isAlive = true;
    private final AnimalBaseCharacteristics animalBaseCharacteristics;

    protected Animal(AnimalBaseCharacteristics animalBaseCharacteristics) {
        this.animalBaseCharacteristics = animalBaseCharacteristics;
    }


    public abstract void eat(Location location);

    public Coordinate movKe(Location location) {
        // implementation
        return null;
    }


    //abstract
    public abstract void increase(Location location);


}
