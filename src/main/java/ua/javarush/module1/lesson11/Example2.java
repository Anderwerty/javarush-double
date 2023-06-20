package ua.javarush.module1.lesson11;

public class Example2 {
    public static void main(String[] args) {
        char c = 0;


        for (int i = 0; i < 200; i++) {
            System.out.println(i + ", "+Integer.toHexString(i)+": " + (char) i);
        }
    }
}
