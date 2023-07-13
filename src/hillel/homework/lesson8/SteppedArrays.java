package hillel.homework.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    private static int minRandom = 0;
    private static int maxRandom;

    public static void main(String[] args) {
        System.out.println("Введіть значення N та M через пробіл або через клавішу Enter:");
        int lines = scanner.nextInt();
        int countElements = scanner.nextInt();
        maxRandom = countElements;
        int[][] result = matrixArray(lines, countElements);
        print(result);

    }

    public static int[][] matrixArray(int lines, int columns) {

        int[][] matrix = new int[lines][columns];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
                matrix[i][j] = random;
            }
        }
        return matrix;
    }
//
//    public static int[][] transpose(int[][] matrix, int lines, int columns) {
//        int[][] transpositionMatrix = new int[columns][lines];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                transpositionMatrix[j][i] = matrix[i][j];
//            }
//        }
//        return transpositionMatrix;
//    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
