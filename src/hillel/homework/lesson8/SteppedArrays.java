package hillel.homework.lesson8;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArrays {
    static Scanner scanner = new Scanner(System.in);
    private static int lines = 5;//scanner.nextInt();
    private static int maxCountElements = 9;//scanner.nextInt();
    private static int minRandom = 0;
    private static int maxRandom = maxCountElements;


    public static void main(String[] args) {

        int[][] result = array(lines, random(minRandom, maxRandom));
        print(result);
    }

    public static int[][] array(int lines, int columns) {

        int[][] matrix = new int[lines][columns];
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                int numberRandom = random(minRandom, maxRandom);
                matrix[i][j] = numberRandom;
            }
            matrix[i] = new int[random(minRandom, maxRandom)];

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
