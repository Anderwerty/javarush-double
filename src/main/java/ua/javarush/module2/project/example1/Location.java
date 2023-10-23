package ua.javarush.module2.project.example1;

import java.util.ArrayList;
import java.util.List;

public class Location {
    //Option 1
    // Item---> Plant, Animal
    //Map<Class<? extends Item>, List<? extends Item>>
    //---------------------------
    //Option 2
    // List<Plants>plants = ....
    // Map<Class<? extends Animal>, List<? extends Animal>>

    //Option 3
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();

    //Option 4
    //Map<Class<? extends Animal>, Integer>

    public void removeAnimalFromLocation(Animal animal){
//
        animals.remove(animal);
    }

    public boolean addAnimalToLocation(Animal animal){
//  check if possible to add new items
       return animals.add(animal);
    }
}
