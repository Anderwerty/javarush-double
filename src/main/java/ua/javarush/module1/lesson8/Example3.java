package ua.javarush.module1.lesson8;

public class Example3 {

    public static void main(String[] args) {
        int size = 3;
        int[][] items = new int[size][size];

        //
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                items[i][j] = i * j;
            }
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(items[i][j] + " ");
            }
            System.out.println();
        }
    }
}
