package ua.javarush.module2.project.example2.domain.animal;

import java.util.HashMap;
import java.util.Map;

//https://refactoring.guru/design-patterns/flyweight
public class AnimalBaseCharacteristics {
    private final int maxWeight;

    private AnimalBaseCharacteristics(int maxWeight) {
        this.maxWeight = maxWeight;
    }


    private static final Map<Class<? extends Animal>, AnimalBaseCharacteristics> CLASS_TO_SETTINGS = new HashMap<>();

    static {

    }

    public static AnimalBaseCharacteristics getByClass(Class<? extends Animal> aClass) {
        return null;
    }
}
