package ua.javarush.module2.lesson8;

public class Example4 {
    public static void main(String[] args) {

    }
}

class User {
    private final int age;
    private final String name;

    User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    User(int age) {
        this.age = age;
        this.name = null;
    }

    User(String name) {
        this(0, name);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
