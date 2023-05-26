package ua.javarush.module1.lesson4;

public class Example14 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        boolean c = a & b; // AND  && - short form; & -long form
        //  a         b        c
        //  true     true      true
        //  true     false     false
        //  false    true      false
        //  false    false     false
        System.out.println(c);
        System.out.println("=====================");
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("======================");

        int f = 1;
        System.out.println("f start: " + f);
        if (false & f++ == 1) { // change it to &&
            System.out.println("if is working");
        }
        System.out.println("f end: " + f);

        // please work with | vs ||
    }
}
