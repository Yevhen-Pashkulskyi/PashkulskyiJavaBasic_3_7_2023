package hillel.homework.lesson7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int lines = 3;//scanner.nextInt();
        int columns = 2;//scanner.nextInt(); //вертікальний массів єто колічество данних (размер) масіва
        int[][] result = matrixArray(lines, columns);
        print(result);
        System.out.println();
        printDubArray(result);

    }

    public static int[][] matrixArray(int lines, int columns) {
        int minRandom = 0;
        int maxRandom = 10;

        int[][] arrayAll = new int[lines][columns];

        for (int i = 0; i < arrayAll.length; i++) {

            for (int j = 0; j < arrayAll[i].length; j++) {
                int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
                arrayAll[i][j] = random;
            }
        }
        return arrayAll;
    }

    public static void printDubArray(int[][] array) {
        // TODO: 12.07.2023 пеевернуть массів сделать трансосед і так что б еслі по вертікале есть пустие то і запісивалі в горізантал так же
        // TODO: 12.07.2023 попробовать с іпользованіем сравнені я массівов
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
//            if (matrix[i] == null) {
//                System.out.println();
//                continue;
//            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

