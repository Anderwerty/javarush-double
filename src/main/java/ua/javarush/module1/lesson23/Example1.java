package ua.javarush.module1.lesson23;

public class Example1 {
    public static void main(String[] args) {
        Class<Integer> integerClass = int.class;
        Class<Integer> integerClass1 = Integer.class;
        System.out.println(integerClass.getName());
        System.out.println(integerClass1.getName());

        System.out.println("=".repeat(100));
        Class<Void> voidClass = void.class;
        Class<Void> voidClass1 = Void.class;
        System.out.println(voidClass.getName());
        System.out.println(voidClass1.getName());

    }
}
