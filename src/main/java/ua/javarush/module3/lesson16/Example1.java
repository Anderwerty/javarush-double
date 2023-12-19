package ua.javarush.module3.lesson16;

public class Example1 {
    public static void main(String[] args) {
        ClientAdapter clientAdapter = new ClientAdapter();
        clientAdapter.execute();
    }
}

class Клієнт {

    public void метод() {
        System.out.println("working");
    }
}

interface Client {
    void execute();
}

class ClientAdapter implements Client {

    private final Клієнт source = new Клієнт();

    @Override
    public void execute() {
        source.метод();
    }
}
