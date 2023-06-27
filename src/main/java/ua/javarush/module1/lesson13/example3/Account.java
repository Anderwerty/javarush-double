package ua.javarush.module1.lesson13.example3;

public class Account {
    private String name;
    public Account() {
        this.id = 3;
    }

    public Account(int id) {
        this.id = id;
//        this.id =100;
    }

    private int id = 1;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
