package ua.javarush.module1.lesson6;

public class Example10 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 20) {
            System.out.println("===");
            if ((i % 7) == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++; // i=7
        }
    }
}
