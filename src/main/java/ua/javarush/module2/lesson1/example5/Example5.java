package ua.javarush.module2.lesson1.example5;

public class Example5 {
    public static void main(String[] args) {

    }
}

class User {
    private String name;
    //...


    public User(String name) {
        this.name = name;
    }
}

class Client extends User {
    private String name;

    public Client(String name) {
        super(name);
        this.name = name;
    }
}
