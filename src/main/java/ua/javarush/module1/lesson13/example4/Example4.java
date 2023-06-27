package ua.javarush.module1.lesson13.example4;

public class Example4 {
    public static void main(String[] args) {
        Cat tomas1 = new Cat("Tomas");
        Cat tomas2 = new Cat("Tomas");

        System.out.println(tomas2.equals(tomas1));

        System.out.println(tomas1.hashCode());
        System.out.println(tomas2.hashCode());


    }
}
