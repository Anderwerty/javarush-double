package ua.javarush.module2.lesson2;

public class Example2 {
    public static void main(String[] args) {
        try {

            A a = new B();
            User user = a.method(null);
        } catch (Exception e) {
            System.out.println("exception");
        }
    }
}

class User {

}

class Client extends User {

}

class MyException extends Exception {
}

abstract class A {

    abstract protected User method(User u) throws Exception;
}

class B extends A {
    @Override
    public Client method(User user) {
        return null;
    }
}

class C extends A{

    @Override
    protected User method(User u) throws Exception {
        return null;
    }
}