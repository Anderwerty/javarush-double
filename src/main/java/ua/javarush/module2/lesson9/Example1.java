package ua.javarush.module2.lesson9;

public class Example1 {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        System.out.println(a1.getClass() == a2.getClass());
        System.out.println(a1.getClass() == A.class);
    }
}

class A{

}
