package ua.javarush.module1.lesson4;

public class Example3 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a && b; // AND
        //  a         b        c
        //  true     true      true
        //  true     false     false
        //  false    true      false
        //  false    false     false
        System.out.println(c);
        System.out.println("=====================");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
