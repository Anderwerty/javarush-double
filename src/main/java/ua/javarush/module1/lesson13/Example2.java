package ua.javarush.module1.lesson13;

public class Example2 {
    public static void main(String[] args) {
        Client client1 = new Client();
        System.out.println("Name: " + client1.getName() + ", age: " + client1.getAge());

        client1.setAge(25);
        client1.setName("Client1");
        System.out.println("Name: " + client1.getName() + ", age: " + client1.getAge());



        System.out.println("=".repeat(25));

        Client client2 = new Client("Alex");
        client2.setAge(10);
        client2.setAge(100);
        System.out.println(client2.getAge());
        System.out.println(client2.getName());
    }
}

class Client {

    private String name;
    private int age;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
