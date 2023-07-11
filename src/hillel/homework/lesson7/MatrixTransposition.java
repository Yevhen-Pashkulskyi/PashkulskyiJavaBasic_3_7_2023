package hillel.homework.lesson7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {
    // TODO: 10.07.2023  нужно сделать масів в масіве
    // TODO: 10.07.2023  метод який змнію місцями індекси 0 та останній reversArray
    // TODO: 10.07.2023 метод траспонування обох масивів та виводе на екран
    // TODO: 11.07.2023 вертікальний массів єто колічество данних (размер) масіва

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int lines = 2;//scanner.nextInt();
        int columns = 3;//scanner.nextInt(); //вертікальний массів єто колічество данних (размер) масіва
//        int[] result = new int[] matrixArray(columns);
//        print(matrixColumns(columns));
        print(matrixArray(lines, columns));
        System.out.println();
        printDubArray(matrixArray(lines, columns));

    }

//    public static int[] matrixColumns(int columns) {
//        int minRandom = 0;
//        int maxRandom = 10;
//        int[] array = new int[columns];
//
//        for (int j = 0; j < array.length; j++) {
//            int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
//            array[j] = random;
//        }
//        return array;
//    }

    public static int[][] matrixArray(int lines, int columns) {
        int minRandom = 0;
        int maxRandom = 10;

        int[][] arrayAll = new int[lines][columns];

        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < columns; j++) {
                int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
                arrayAll[i][j] = random;
            }
        }
        return arrayAll;
    }

    public static void printDubArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }

    //    public static void print(int[][] array) {
//        for (int[] arrayPrint : array) {
//            System.out.print(" " + arrayPrint);
//        }
//
//    }
    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

