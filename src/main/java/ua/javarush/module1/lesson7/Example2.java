package ua.javarush.module1.lesson7;

public class Example2 {
    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 1;
        array[1] = array[0] + 1;
        array[2] = array[1]++;
        array[3]++;

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
    }
}
