package hillel.homework.lesson7;

import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MatrixTransposition {
    // TODO: 10.07.2023  нужно сделать масів в масіве
    // TODO: 10.07.2023  метод який змнію місцями індекси 0 та останній reversArray
    // TODO: 10.07.2023 метод траспонування обох масивів та виводе на екран
    // TODO: 11.07.2023 вертікальний массів єто колічество данних (размер) масіва

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int lines = scanner.nextInt();
        int columns = scanner.nextInt(); //вертікальний массів єто колічество данних (размер) масіва
//        int[] result = new int[] matrixArray(columns);
        print(matrixColumns(columns));
    }

    public static int[] matrixColumns(int columns) {

        int minRandom = 0;
        int maxRandom = 10;
        int[] array = new int[columns];


        for (int cloumns = 0; cloumns < array.length; cloumns++) {
            int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
            array[cloumns] = random;
        }

        return array;
    }

    public static int[][] matrixArray(int[] array, int lines) {
        int[][] arrayAll = new int[lines][];
        for (int i = 0; i < lines; i++) {
            arrayAll[i][print(matrixColumns())] =
        }

    }

    public static void print(int[] array) {
        for (int arrayPrint : array) {
            System.out.print(" " + arrayPrint);
        }

    }

    public static void printDubArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}
