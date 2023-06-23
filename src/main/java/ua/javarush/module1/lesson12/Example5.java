package ua.javarush.module1.lesson12;

public class Example5 {
    public static void main(String[] args) {
        byte a = 100;
        short b = a;

         byte c = (byte)(a+(byte)b);
    }
}
