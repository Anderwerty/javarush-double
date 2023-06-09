package ua.javarush.module1.lesson8;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 5}; // {1,2,3,4}
        int[] second = {};
        int[] third = {31, 31, 30};
        int[] fourth = {31, 30, 31};

        int[][] months = {
                first,
                second,
                third,
                fourth
        };

        for (int i = 0; i < months.length; i++) {
            for (int j = 0; j < months[i].length; j++) {
                System.out.print(months[i][j] + " ");
            }
            System.out.println();
        }
    }
}
