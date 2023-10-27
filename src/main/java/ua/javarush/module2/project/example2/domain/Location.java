package ua.javarush.module2.project.example2.domain;

import ua.javarush.module2.project.example2.domain.animal.Animal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Location {
    //Option 1
    // Item---> Plant, Animal
    //Map<Class<? extends Item>, List<? extends Item>>
    //---------------------------
    //Option 2
    // List<Plants>plants = ....
    // Map<Class<? extends Animal>, List<? extends Animal>> map
    // map.put(Dog.class, new ArrayList<Dog>());

    //Option 3
    public final List<Animal> animals = new ArrayList<>(); //??
    private final List<Plant> plants = new ArrayList<>();

    //Option 4
    //Map<Class<? extends Animal>, Integer>


    public ReentrantLock lock  = new ReentrantLock(true);

    public void removeAnimalFromLocation(Animal animal){
//
        animals.remove(animal);
    }

    public boolean addAnimalToLocation(Animal animal){
//  check if possible to add new items
       return animals.add(animal);
    }
}
