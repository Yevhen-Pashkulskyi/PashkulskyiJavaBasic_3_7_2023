package main.java.hillel.homework.lesson8;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    private final int lines;
    private final int maxCountElements;
    private static final int minRandom = 0;
    private static int maxRandom;

    public static void main(String[] args) {

        System.out.println("Введіть через пробіл або через клавішу enter кількість строк та стовпчики ");
        int lines = scanner.nextInt();
        int maxCountElements = scanner.nextInt();

        SteppedArrays value = new SteppedArrays(lines, maxCountElements);

        int[][] array = creationArray(lines);
        System.out.println("Array original");
        printDoubleArray(array);

        System.out.println();
        System.out.println("Sync sort : ");
        printDoubleArray(syncSortElements(array));

        System.out.println();
        System.out.println("Total sum elements : " + sumElements(array));

        System.out.println();
        System.out.println("Min with array elements:");
        printArray(minAllElements(array));

        System.out.println();
        System.out.println("Min elements: " + minNumber(minAllElements(array)));

        System.out.println();
        System.out.println("Divide result ");
        printDoubleArray(divideResult(array, minNumber(minAllElements(array))));
    }

    private SteppedArrays(int lines, int maxCountElements) {
        this.lines = lines;
        this.maxCountElements = maxCountElements;
        this.maxRandom = maxCountElements;
    }

    // Метод создает массів
    public static int[][] creationArray(int lines) {
        int[][] array = new int[lines][];
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[random(minRandom + 1, maxRandom)];

            for (int j = 0; j < array[i].length; j++) {
                int numberRandom = random(minRandom, maxRandom);
                array[i][j] = numberRandom;
            }
        }
        return array;
    }

    // Метод сортирує парні рядки за зростанням та непарні за спаданням
    public static int[][] syncSortElements(int[][] array) {
        sortEvenRows(array);
        sortOddRows(array);
        return array;
    }

    // Метод сумує всі елементи
    private static int sumElements(int[][] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    //Метод знаходе мінімальне значення в кожній строчці двумірного масива та провіряє є масив порожнім виводе його масивом одномірним
    public static int[] minAllElements(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int[] minElements = new int[array.length];//
        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < array[i].length; j++) {
                min = minNumber(array[i]);
            }
            minElements[i] = min;
        }
        return minElements;
    }

    //Метод знаходе мінімальне значення в масиві та проверяє є масив порожнім
    public static int minNumber(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Передан порожній масив");
        }
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Метод поділяє всш елементи двумірного масива на мінімальне значення якщо можливо , якщо ни выдаэ значення -1
    public static int[][] divideResult(int[][] array, int min) {
        if (min != 0 & array != null) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] /= min;
                }
            }
        } else {
            int[][] errorArray = new int[array.length][];
            for (int i = 0; i < array.length; i++) {
                errorArray[i] = new int[array[i].length];
                Arrays.fill(errorArray[i], -1);
            }
            array = errorArray;
        }
        return array;
    }

    //Метод сортує парні строки з зростанням
    public static void sortEvenRows(int[][] array) {
        for (int i = 0; i < array.length; i += 2) {
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
        }
    }

    //Метод сортує не парні строки з спаданням
    public static void sortOddRows(int[][] array) {
        for (int i = 1; i < array.length; i += 2) {
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

    //Метод створює рандомне число в діапозоне мін і макс
    public static int random(int minRandom, int maxRandom) {
        int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        return random;
    }

    //Метод разпичатує двумірні масиви та іспользує метод для печаті одномірного масива
    public static void printDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
    }

    //Метод розпічатує одномірні масиви
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

