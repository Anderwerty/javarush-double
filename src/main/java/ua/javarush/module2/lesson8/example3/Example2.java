package ua.javarush.module2.lesson8.example3;

public class Example2 {

    private static final String DELIMETER = "=".repeat(100);

    public static void main(String[] args) {
        new A(1000);
        System.out.println(DELIMETER);
        new A(1000);
    }
}

class Super{
    static {
        System.out.println("Super static block");
    }

    public Super(){
        System.out.println("super class");
    }



    {
        System.out.println("Super no-static block");
    }
}

class A extends Super {
    static {
        System.out.println("A static block");
    }
    private int value = 5;

    {
        System.out.println("no-static block class A-1 start: value=" + value);
        value = 6;
        System.out.println("no-static block class A-1 end: value=" + value);

    }


    public A(int value) {
        // 1..
        super();
        // 2..
        System.out.println("constructor start: value=" + this.value);
        this.value = value;
        System.out.println("constructor end: value=" + this.value);
    }

    {
        System.out.println("no-static block class A-2 start: value=" + value);
        value = 66;
        System.out.println("no-static block class A-2 end: value=" + value);

    }
}
