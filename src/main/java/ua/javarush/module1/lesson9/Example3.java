package ua.javarush.module1.lesson9;

public class Example3 {
    public static void main(String[] args) {
        int[] items = {1, 2, 3, 4};

        printArray(items);

        items[0] = 100;
        System.out.println("=====================");
        printArray(items);
    }

    public static void printArray(int[] items) {
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
