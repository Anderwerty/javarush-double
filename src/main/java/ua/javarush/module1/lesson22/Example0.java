package ua.javarush.module1.lesson22;

public class Example0 {
    public static void main(String[] args) {
        try {
            int[] ints = new int[Integer.MAX_VALUE - 4];
        } catch (Error e) {
            System.out.println(".............");
            System.out.println(e);
        }
    }
}
