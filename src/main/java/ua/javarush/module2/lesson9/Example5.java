package ua.javarush.module2.lesson9;

public class Example5 {
    public static void main(String[] args) {
        Class<Integer> integerClass = int.class;
        Class<Integer> integerClass1 = Integer.class;
        System.out.println(integerClass == integerClass1);
    }
}
