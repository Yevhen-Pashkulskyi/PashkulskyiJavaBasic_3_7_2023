package hillel.homework.lesson7;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int lines = scanner.nextInt();
        int columns = scanner.nextInt(); //вертікальний массів єто колічество данних (размер) масіва
        int[][] result = matrixArray(lines, columns);
        print(result);
        System.out.println();
        print(transpored(result, lines, columns));
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

    public static int[][] transpored(int[][] array, int lines, int columns) {
        int[][] newMatrix = new int[columns][lines];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newMatrix[j][i] = array[i][j];
            }
        }
        return newMatrix;
    }

//    public static void printDubArray(int[][] array) {
//        // TODO: 12.07.2023 пеевернуть массів сделать трансосед і так что б еслі по вертікале есть пустие то і запісивалі в горізантал так же
//        // TODO: 12.07.2023 попробовать с іпользованіем сравнені я массівов
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[j][i] + " ");
//            }
//            System.out.println();
//        }
//    }

    private static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

