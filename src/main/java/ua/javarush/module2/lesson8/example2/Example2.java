package ua.javarush.module2.lesson8.example2;

public class Example2 {
    public static void main(String[] args) {
        new A(1000);
    }
}

class A {
    private int value = 5;

    {
        System.out.println("no-static block start: value=" + value);
        value = 6;
        System.out.println("no-static block end: value=" + value);

    }


    public A(int value) {
        System.out.println("constructor start: value=" + this.value);
        this.value = value;
        System.out.println("constructor end: value=" + this.value);
    }

    {
        System.out.println("no-static block start: value=" + value);
        value = 66;
        System.out.println("no-static block end: value=" + value);

    }
}
