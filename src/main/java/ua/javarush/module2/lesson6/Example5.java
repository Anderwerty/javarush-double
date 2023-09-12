package ua.javarush.module2.lesson6;

import java.util.function.Function;
import java.util.function.Predicate;

public class Example5 {

    public static void main(String[] args) {

        Function<String, Integer> symbolCounter =
                (line) -> line.length();


        Predicate<String> predicate = (line) -> line.contains("@");


        System.out.println(symbolCounter.apply("123456"));
        System.out.println(predicate.test("emailXgmail.com"));
        System.out.println(predicate.test("email@gmail.com"));
    }
}
