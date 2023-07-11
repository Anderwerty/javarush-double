package ua.javarush.module1.lesson17;

import java.util.HashSet;
import java.util.Set;

public class Example6 {
    public static void main(String[] args) {
//TODO : видалити від'ємні елементи


        Set<Integer> numbers = new HashSet<>();
        numbers.add(7);
        numbers.add(-2);
        numbers.add(-7);
        numbers.add(14);
        numbers.add(4);
        System.out.println(numbers);


        Set<Integer> copyNumbers = new HashSet<>(numbers);
        for (Integer number : copyNumbers) {
            if (number < 0) {
                numbers.remove(number);
            }
        }
        System.out.println(numbers);
    }
}
