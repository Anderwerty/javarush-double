package ua.javarush.module1.lesson13;

public class Example1 {
    public static void main(String[] args) {
        User user = new User();
        int age = user.getAge();

        System.out.println(age);

        System.out.println(user.getName());

    }
}

class User {

    public  User(){
        System.out.println("constructor User");
    }

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
}
