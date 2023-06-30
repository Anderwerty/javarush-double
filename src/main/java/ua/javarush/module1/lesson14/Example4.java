package ua.javarush.module1.lesson14;

public class Example4 {
    public static void main(String[] args) {
        new B().B();
    }
}

class B {
    public void B() {
        System.out.println("Create B");
    }
}
