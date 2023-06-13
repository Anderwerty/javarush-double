package ua.javarush.module1.lesson9;

public class Example6 {
    public static void main(String[] args) {
        int value = 5;
        methodWithPrimitive(value);

        System.out.println(value);

        String stringValue = "Hello";

        methodWithString(stringValue);
        System.out.println(stringValue);

        int[] items = {1, 2};
        System.out.println(items);
        methodWithArrayToNull(items);
        System.out.println(items);

        methodWithArray(items);
        for (int item : items) {
            System.out.print(item + " ");
        }
    }

    public static void methodWithPrimitive(int value) {
        value = 500;
    }

    public static void methodWithString(String value) {
        value = "method with string";
    }

    public static void methodWithArrayToNull(int[] items) {
        items = null;
    }

    public static void methodWithArray(int[] items) {
        items[0] = 100;
        items[1] = 200;
    }


}
