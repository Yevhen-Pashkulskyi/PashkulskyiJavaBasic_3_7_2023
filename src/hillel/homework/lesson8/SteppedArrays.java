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
        int[][] array = array(dataArray);
        System.out.println("array");
        print(array);

        System.out.println("sort : ");
        print(syncSortElements(array));

        System.out.println("Total sum elements : " + sumElements(array));
//        System.out.println("revers : ");
//        reversSortElement(array);// нужно будет убрать , єто лішній массів
//        print(revers);

//        System.out.println("чередованіе четное і нечетное");
//        print(syncSortReverse(array));

    }

    // метод создает массів
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

    //
//    public static int[][] syncSortReverse(int[][] array) {
//       int [][] syncArray  ;
//
//        for (int i = 0; i < array.length; i++) {
//
//            if (i % 2 == 0) {
//                i
//            } else {
//               array = reversSortElement(array);
//            }
//        }
//        return syncArray;
//    }


    //метод создает рандомное чісло в діапозоне мін і макс
    public static int random(int minRandom, int maxRandom) {
        int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        return random;
    }


    //меттод виводіт массіви
    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[][] syncSortElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                // Сортировка четной строки по возрастанию (сортировка выбором)
                for (int j = 0; j < array[i].length - 1; j++) {
                    int minIndex = j;
                    for (int k = j + 1; k < array[i].length; k++) {
                        if (array[i][k] < array[i][minIndex]) {
                            minIndex = k;
                        }
                    }
                    int temp = array[i][j];
                    array[i][j] = array[i][minIndex];
                    array[i][minIndex] = temp;
                }
            } else {
                // Сортировка нечетной строки по убыванию (сортировка пузырьком)
                for (int j = 0; j < array[i].length - 1; j++) {
                    for (int k = 0; k < array[i].length - j - 1; k++) {
                        if (array[i][k] < array[i][k + 1]) {
                            int temp = array[i][k];
                            array[i][k] = array[i][k + 1];
                            array[i][k + 1] = temp;
                        }
                    }
                }
            }
        }
        return array;
    }

    // метод сумує всі елементи
    private static int sumElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        sum = sum * array.length;
        return sum;
    }

//    //метод сортирует строку по возростанию
//    public static int[][] sortElements(int[][] array) {
//        boolean swapped;
//        do {
//            swapped = false;
//            for (int i = 0; i < array.length; i = i + 2) {
//
//                if (i % 2 !== 0) {
//                    continue;
//                } else {
//                    for (int j = 0; j < array[i].length - 1; j++) {
//                        if (array[i][j] > array[i][j + 1]) {
//                            int temp = array[i][j];
//                            array[i][j] = array[i][j + 1];
//                            array[i][j + 1] = temp;
//                            swapped = true;
//                        }
//                    }
//                }
//            }
//        } while (swapped);
//        return array;
//    }
//
//
//    //метод сортирует по убиванию
//    public static int[][] reversSortElement(int[][] array) {
//        boolean swapped;
//        do {
//            swapped = false;
//            for (int i = 0; i < array.length; i++) {
//
//                int steps = array[i].length - 1;
//
//                for (int j = 0; j < steps; j++) {
//                    if (array[i][j] < array[i][j + 1]) {
//                        int temp = array[i][j];
//                        array[i][j] = array[i][j + 1];
//                        array[i][j + 1] = temp;
//                        swapped = true;
//                    }
//                }
//            }
//        } while (swapped);
//        return array;
//    }


}
