package ua.javarush.module1.lesson9;

public class Example13 {
    public static void main(String[] args) {
        int a = 5;
        if (a < 10) {
            int b = 10;
            boolean b1 = true;
            while (b1) {
                int x = a + b;
                System.out.println(x);
            }
            System.out.println(b);
        }
        System.out.println();
    }
}
