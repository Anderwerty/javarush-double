package ua.javarush.module1.lesson18;

public class Example6 {
    public static void main(String[] args) {
        int n = 10; // ---> infinity

        // O(n^2 +2n) =
        for (int i = 0; i < n*n ; i++) {
            System.out.println(i);
        }

        for (int i = 0; i < n+1000; i++) {
            // stop for 1 minute
            System.out.println(i);
        }
    }
}
