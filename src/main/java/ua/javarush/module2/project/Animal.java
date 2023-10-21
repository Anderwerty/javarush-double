package ua.javarush.module2.project;

import lombok.Getter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public abstract class Animal {
    private int startWeight;

    public static void main(String[] args) {
        Cat cat = new Cat();
        AnimalSettings annotation =
                cat.getClass().getAnnotation(AnimalSettings.class);
        int maxWeight = annotation.maxWeight();
    }
}


@AnimalSettings(maxWeight = 10, maxSteps = 2, matrix = "fileName")
@Getter
class Cat extends Animal {
    private int currentWeight;
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface AnimalSettings{
    int maxWeight();
    int maxSteps();
    
    String matrix();
}
