package ua.javarush.module1.lesson11;

import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4, 5};
        int[][] items1 ={{1,2,3},{1,2},{}, {23,4}};
        printArray(items);
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.deepToString(items1));

        reversArray(items);
        System.out.println("=".repeat(10));
        printArray(items);
    }

    private static void reversArray(int[] items) {
        for (int i = 0; i < items.length / 2; i++) {
            int temp = items[i];
            items[i] = items[items.length - 1 - i];
            items[items.length - 1 - i] = temp;
        }
    }

    private static void printArray(int[] items) {
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
