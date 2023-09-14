package ua.javarush.module2.lesson6;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Example8 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Tom"));
        cats.add(new Cat("Bazilio"));
        cats.add(new Cat("Kiti"));
        cats.add(new Cat("Kiti"));
        cats.add(new Cat("Kiti"));
        cats.add(new Cat("Bazilio"));

        Set<Cat> collect = cats.stream()
                .filter(Objects::nonNull)
//                .map(Cat::getName)
                .collect(Collectors.toSet());

        System.out.println(collect);


        cats.stream()
                .collect(Collectors.toMap(Cat::getName, x -> 1, Integer::sum, LinkedHashMap::new))
                .forEach((name, count) -> System.out.println(name + ": " + count));


        String s = cats.stream()
                .collect(StringBuilder::new,
                        (stringContainer, cat) -> stringContainer.append(cat).append(" "),
                        StringBuilder::append).toString();
        System.out.println(s);

        Object ob = null;
        ob.toString();

    }
}

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
