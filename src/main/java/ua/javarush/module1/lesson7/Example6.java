package ua.javarush.module1.lesson7;

public class Example6 {
    public static void main(String[] args) {
        int[] items = new int[]{1, 2, 3, 4};
        int[] items2 = {1, 2, 3, 4,};

        for (int i = 0; i < items.length; i++) {
            System.out.println("array[" + i + "]=" + items[i]);
        }

        System.out.println("==================================");
        System.out.println(items.length);
        System.out.println(items2.length);
    }
}
