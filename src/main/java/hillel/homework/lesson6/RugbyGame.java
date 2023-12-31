package hillel.homework.lesson6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RugbyGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number of players : ");
        int players = scanner.nextInt(); //25
        System.out.println("Enter minimum age : ");
        int lowAge = scanner.nextInt(); //18
        System.out.println("Enter maximum age : ");
        int highAge = scanner.nextInt(); //40


        System.out.println("First team age list : ");
        int[] firstTeam = randomAgeTeam(players, lowAge, highAge);

        System.out.println();

        System.out.print("Average age first team : ");
        averageAge(firstTeam);

        System.out.println();
        System.out.println("Second team age list : ");
        int[] secondTeam = randomAgeTeam(players, lowAge, highAge);

        System.out.println();

        System.out.print("Average age second team : ");
        averageAge(secondTeam);

    }

    public static int[] randomAgeTeam(int players, int lowAge, int highAge) {
        int[] arrayAge = new int[players];
        for (int i = 0; i < arrayAge.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(lowAge, highAge);//вивод рандомного чісла
            arrayAge[i] = randomAge; //здесь счетчік ставіт індекс масіва і прісваевает рандомное чісло к єтому індексу
            System.out.print(" " + arrayAge[i]);
        }
        return arrayAge;
    }

    public static int[] averageAge(int[] averAgeTeam) {
        int sumAverageAge = 0;
        for (int i = 0; i < averAgeTeam.length; i++) {
            sumAverageAge += averAgeTeam[i];
        }
        sumAverageAge = sumAverageAge / averAgeTeam.length;

        return new int[]{sumAverageAge};
    }

}
