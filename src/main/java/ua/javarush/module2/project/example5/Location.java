package ua.javarush.module2.project.example5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class Location {
    private final AnimalFactory animalFactory;

    private final Map<Class<? extends Animal>, List<Animal>> classToAnimal = new HashMap<>();

    public Location(AnimalFactory animalFactory) {
        this.animalFactory = animalFactory;

    }


    public void init() {
        Map<Class<? extends Animal>, Integer> list = new HashMap<>();

        list.forEach((aClass, number) -> processAnimal(aClass, randomNumber(number)));

    }

    private int randomNumber(Integer number) {
        return 0;
    }

    private void processAnimal(Class<? extends Animal> animalClass, int number) {
        for (int i = 0; i <number ; i++) {
            List<Animal> animals = new ArrayList<>();
            animals.add(animalFactory.create(animalClass));
            classToAnimal.merge(animalClass, animals, (o1, o2) -> {
                o1.addAll(o2);
                return o1;
            });

        }
    }
}

class AnimalFactory {

    private final Map<Class<? extends Animal>, Supplier<? extends Animal>> map = new HashMap<>();

    {
        map.put(Wolf.class, Wolf::new);
        map.put(Cat.class, () -> new Cat());
    }

    public Animal create(Class<? extends Animal> aClass) {
        return map.get(aClass).get();
    }
}