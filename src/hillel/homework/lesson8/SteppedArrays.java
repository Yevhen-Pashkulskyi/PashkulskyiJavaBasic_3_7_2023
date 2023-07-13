package hillel.homework.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    static int minRandom = 0;
    static int maxRandom = scanner.nextInt();

    public static void main(String[] args) {
        System.out.println("Введіть значення N та M через пробіл або через клавішу Enter:");
        int lines = scanner.nextInt();
        int countElements = scanner.nextInt();
        int[][] result = matrixArray(lines, countElements);
        System.out.println("Original matrix :");
        print(result);
        System.out.println();
        System.out.println("The matrix is transposed :");
        print(transpose(result, lines, countElements));
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

    public static int[][] transpose(int[][] matrix, int lines, int columns) {
        int[][] transpositionMatrix = new int[columns][lines];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpositionMatrix[j][i] = matrix[i][j];
            }
        }
        return transpositionMatrix;
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
