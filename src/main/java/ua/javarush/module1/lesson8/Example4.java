package ua.javarush.module1.lesson8;

public class Example4 {
    public static void main(String[] args) {
        int[][] months0 = {
                {31, 28, 31},
                {30, 31, 30},
                {31, 31, 30},
                {31, 30, 31}
        };
        int[] first = {31, 28, 31}; // {1,2,3,4}
        int[] second = {30, 31, 30};
        int[] third = {31, 31, 30};
        int[] fourth = {31, 30, 31};

        int[][] months = {
                first,
                second,
                third,
                fourth
        };

        (months[1])[2]++;

        months[0] = new int[]{10, 20, 30, 40};
    }
}
