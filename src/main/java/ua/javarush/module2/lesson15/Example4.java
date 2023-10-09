package ua.javarush.module2.lesson15;

import java.util.function.Consumer;

public class Example4 {
    public static void main(String[] args) {
        int value = 1;
        Container container = new Container();
        Consumer<Integer> consumer = (number) -> {
            System.out.println(number + value + container.value);
        };
        container.value++;
//        container = null;
//        value++;
    }
}

class Container {
    public int value;
}
