package ua.javarush.module1.lesson11;

public class Example4 {
    public static void main(String[] args) {
        int[] items = {1, 2, 3, 0,};
        printArray(items);
        printArray(new int[]{1, 2, 3, 4});

        printArray(); // ---> printArray(new int[]{});
        printArray(1,2,3);
        printArray(1,2,3, 4,0,5 ,5 );
    }

    private static void printArray(int... items) {
        for (int item : items) {
            System.out.print(item + " ");
        }
        System.out.println();

    }
}
