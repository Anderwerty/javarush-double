package ua.javarush.module1.lesson8;

public class Example2 {
    public static void main(String[] args) {
        int[][] table = new int[5][2];// 1-index [0;4] 2-index [0;1]
        table[0][0] = 1;
        table[1][0] = 1;
        table[2][0] = 3;
        table[3][0] = 4;
        table[4][0] = 5;

        table[0][1] = 1;
        table[1][1] = 1;
        table[2][1] = 3;
        table[3][1] = 4;
        table[4][1] = 4;

        table[3][4] =1;

    }
}
