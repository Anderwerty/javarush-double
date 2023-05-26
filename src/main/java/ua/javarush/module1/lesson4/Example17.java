package ua.javarush.module1.lesson4;

public class Example17 {
    public static void main(String[] args) {
        int color = 1;
        String message = (color == 1) ? "Go" : ((color == 2) ? "Prepare" : "Wait ...");

        System.out.println(message);
    }
}
