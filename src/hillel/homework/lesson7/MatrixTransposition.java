package hillel.homework.lesson7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введіть значення M та N через пробіл або через клавішу Enter:");
        int lines = scanner.nextInt();
        int columns = scanner.nextInt(); //вертікальний массів єто колічество данних (размер) масіва
        int[][] result = matrixArray(lines, columns);
        System.out.println("Original matrix :");
        print(result);
        System.out.println();
        System.out.println("The matrix is transposed :");
        print(transposition(result, lines, columns));
    }

    public static int[][] matrixArray(int lines, int columns) {
        int minRandom = 0;
        int maxRandom = 10;

        int[][] matrix = new int[lines][columns];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
                matrix[i][j] = random;
            }
        }
        return matrix;
    }

    public static int[][] transposition(int[][] matrix, int lines, int columns) {
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

