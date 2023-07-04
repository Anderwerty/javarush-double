package ua.javarush.module1.lesson15;

public class Example3 {
    public static void main(String[] args) {
        Class stringClass = String.class;

        Class stringClass1 = String.class;

        System.out.println(stringClass == stringClass1);

        String s = "String class";
        Class aClass = s.getClass();

        System.out.println(int.class == Integer.class);

        System.out.println(int.class.getName());
        System.out.println(Integer.class.getName());

        System.out.println(void.class.getName());
    }
}
