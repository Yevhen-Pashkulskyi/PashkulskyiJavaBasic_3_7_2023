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

        int[][] result = array(lines, random(minRandom, maxRandom));
        print(result);
    }

    public static int[][] array(int lines, int columns) {

        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < matrix.length; i++) {

            matrix[i] = new int[random(minRandom + 1, maxRandom)];

            for (int j = 0; j < matrix[i].length; j++) {
                int numberRandom = random(minRandom, maxRandom);
                matrix[i][j] = numberRandom;
            }

        }

        return matrix;
    }

    public static int random(int minRandom, int maxRandom) {
        int random = ThreadLocalRandom.current().nextInt(minRandom, maxRandom);
        return random;
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
