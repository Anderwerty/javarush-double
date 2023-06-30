package ua.javarush.module1.lesson14;

public class Example2 {
    public static void main(String[] args) {
        Account alex = new Account("Alex");
        System.out.println(alex.getId());

        Account bob = new Account("Bob");
        System.out.println(bob.getId());
    }
}

class Account {

    private static int idCounter = 0;

    private int id;
    private String name;

    public Account(String name) {
        this.name = name;
        id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
