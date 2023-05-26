package ua.javarush.module1.lesson4;

public class Example4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a || b; // OR
        //  a         b        c
        //  true     true      true
        //  true     false     true
        //  false    true      true
        //  false    false     false
        System.out.println(c);
        System.out.println("=====================");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


    }

}
