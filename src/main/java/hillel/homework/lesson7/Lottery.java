package hillel.homework.lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class Lottery {
    public static void main(String[] args) {

        resultTask();

    }

    public static int[] arrayRandom(int numbers, int lowRandom, int highRandom) {
        int[] resultNumbers = new int[numbers];
        for (int i = 0; i < resultNumbers.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(lowRandom, highRandom);
            resultNumbers[i] = randomAge;
        }

        return resultNumbers;
    }

    private static void print(int[] array) {
        for (int index : array) {
            System.out.print(index + " ");
        }
        System.out.println();
    }

    private static int[] sort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
        return array;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void resultTask() {
        int numbers = 7;
        int lowRandom = 0;
        int highRandom = 9;
        int[] playersArray = sort(arrayRandom(numbers, lowRandom, highRandom));
        int[] companyArray = sort(arrayRandom(numbers, lowRandom, highRandom));
        print(playersArray);
        print(companyArray);

        int sumComparison = 0;
        for (int i = 0; i < playersArray.length; i++) {
            if (playersArray[i] == companyArray[i]) {
                sumComparison += 1;
//                System.out.println("Збіг індексів " + i);
            }
        }
        System.out.println("Кількість збігів: " + sumComparison);


    }
}
