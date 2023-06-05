package ua.javarush.module1.lesson6;

public class Example11 {
    public static void main(String[] args) {
        int i = 1;
        for (; i <= 20; ) {
            if (i % 7 == 0) {
                continue;
            }

            System.out.println(i++);
        }
    }
}
