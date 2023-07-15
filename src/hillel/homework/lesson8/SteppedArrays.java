package hillel.homework.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    private static int lines = 7;
    private static int maxCountElements = 9;
    private static int minRandom = 0;
    private static int maxRandom = maxCountElements;


    public static void main(String[] args) {
//        System.out.println("Введіть значення M та N через пробіл або через клавішу Enter:");
//        lines = scanner.nextInt();
//        maxCountElements = scanner.nextInt();
        int[][] dataArray = new int[lines][random(minRandom, maxRandom)];
        int[][] result = array(dataArray);
        System.out.println("array");
        print(result);

        System.out.println("sort : ");
        sortElements(result);// нужно будет убрать , єто лішній массів
//        print(sort);
        System.out.println("revers : ");
        reversSortElement(result);// нужно будет убрать , єто лішній массів
//        print(revers);

    }

    public static int[][] array(int[][] dataArray) {

        for (int i = 0; i < dataArray.length; i++) {

            dataArray[i] = new int[random(minRandom + 1, maxRandom)];

            for (int j = 0; j < dataArray[i].length; j++) {
                int numberRandom = random(minRandom, maxRandom);
                dataArray[i][j] = numberRandom;
            }

        }

        return dataArray;
    }

    public static int[][] syncReverse(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (array.length % 2 = 0) {

            }
        }
        return array;
    }

    public static int random(int minRandom, int maxRandom) {
        int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        return random;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void /*int[][]*/ sortElements(int[][] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length; i++) {

                int steps = array[i].length - 1;

                for (int j = 0; j < steps; j++) {
                    if (array[i][j] > array[i][j + 1]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
//        return array;
    }

    public static void /*int[][]*/ reversSortElement(int[][] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < array.length; i++) {

                int steps = array[i].length - 1;

                for (int j = 0; j < steps; j++) {
                    if (array[i][j] < array[i][j + 1]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                        swapped = true;
                    }
                }
            }
        } while (swapped);
//        return array;
    }
}
