package ua.javarush.module1.lesson8;

public class Example7 {
    public static void main(String[] args) {

        //int[][][][] matrix = new int[2][3][4][5];

        long[][][][] matrix = new long[2][][][]; // створюємо масив «посилань на посилання на посилання» довжини
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new long[3][][]; // створюємо масив «посилань на посилання» довжини 3
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = new long[4][]; // створюємо масив посилань довжини 4
                for (int k = 0; k < matrix[i][j].length; k++) {
                    matrix[i][j][k] = new long[5]; // створюємо масиви цілих чисел довжини 5
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix[i][j].length; k++) {
                    for (int l = 0; l < matrix[i][j][k].length; l++) {
                        matrix[i][j][k][l] = i * j * k * l;
                    }
                }
            }
        }


        System.out.println(matrix);
    }
}
