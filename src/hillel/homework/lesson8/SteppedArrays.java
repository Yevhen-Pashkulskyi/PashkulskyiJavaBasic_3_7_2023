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
//        System.out.println("revers : ");
//        reversSortElement(array);// нужно будет убрать , єто лішній массів
//        print(revers);

//        System.out.println("чередованіе четное і нечетное");
//        print(syncSortReverse(array));

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

            int min = Integer.MAX_VALUE; //array[0][0];

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
//        int []divide = new int[array.length];

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (min == 00) {
                System.out.println("NaN на  0  поділяти не можна");
                break;
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    result = array[i][j] / min;
                    System.out.println("String " + i + array[i][j] + "/" + min + " = " + result);
                }
            }
//            for (int j = 0; j < array[i].length; j++) {
//                if (min == 0) {
//                    System.out.println("NaN на  0  поділяти не можна");
//                    break;
//                }else {
//                    result = array[i][j] / min;
//                    System.out.println("String " + i + array[i][j] + "/"+ min + " = " + result);
//                }
//            }
//            divide[i] = min;
        }
//        return divide;
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

}
