package ua.javarush.module3.lesson18;

public class Example1 {
    public static void main(String[] args) {
        Resource resource = new Resource();

        MyThread thread1 = new MyThread(resource);
        MyThread thread2 = new MyThread(resource);

        thread1.start();
        thread2.start();
    }
}

class User{
    private final Address address = new Address();
    private final Contact contact = new Contact();
}
class Address{ }

class Contact{ }

class Resource {

    private final User object = new User();

    public void method1() {
        int value = 1;
        User local = object;
    }

    public void method2() {
        Object value = new Object();
    }
}

class MyThread extends Thread{
    private final Resource resource;

    MyThread(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.method1();

        resource.method2();
    }
}
