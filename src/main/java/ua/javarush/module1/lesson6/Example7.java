package ua.javarush.module1.lesson6;

public class Example7 {
    static int i = 0;

    public static void main(String[] args) {
        do {
            System.out.println("do - while");
            i++;
        } while (i < 0);
    }
}
