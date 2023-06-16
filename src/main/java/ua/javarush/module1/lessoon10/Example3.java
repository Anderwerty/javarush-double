package ua.javarush.module1.lessoon10;

public class Example3 {
    public static int count = 0;
    public static int sum = 0;

    public static void add(int data) {
        sum += data;
        int sum = data * 2;
        count++;
        System.out.println(sum);
        System.out.println(Example3.sum);

    }
}
