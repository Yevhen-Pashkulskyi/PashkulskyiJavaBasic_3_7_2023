package hillel.homework.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    private static int lines = scanner.nextInt();
    ;
    private static int maxCountElements = scanner.nextInt();
    private static int minRandom = 0;
    private static int maxRandom = maxCountElements;

    public static void main(String[] args) {
        int[][] dataArray = new int[lines][random(minRandom, maxRandom)];
        int[][] array = array(dataArray);

        System.out.println("array");
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
        divideResult(array, minNumber(minAllElements(array)));
    }

    // Метод создает массів
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

    // Метод сортирує парні рядки за зростанням та непарні за спаданням
    public static int[][] syncSortElements(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                // Сортування парної строки за зростанням (сортування вибором)
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
                // Сортування непарної строки з спадання (сортування бульбашковим методом)
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

    //Метод знаходе мінімальне значення в кожній строчці двумірного масива та виводе його масивом одномірним
    public static int[] minAllElements(int[][] array) {
        int[] minElements = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            minElements[i] = min;
        }
        return minElements;
    }

    //Метод знаходе мінімальне значення в масиві
    public static int minNumber(int[] array) {
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Метод поділяє всш елементи двумірного масива на мінімальне значення
    public static void divideResult(int[][] array, int min) {
        int result;

        for (int i = 0; i < array.length; i++) {
            if (min == 00) {
                System.out.println("Error на 0 поділяти не можна");
                break;
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    result = array[i][j] / min;
                    System.out.println("String " + i + array[i][j] + "/" + min + " = " + result);
                }
            }
        }
    }

    //Метод створює рандомне число в діапозоне мін і макс
    public static int random(int minRandom, int maxRandom) {
        int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        return random;
    }

    //Метод разпичатує двумірні масиви
    public static void printDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Метод розпічатує одномірні масиви
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
