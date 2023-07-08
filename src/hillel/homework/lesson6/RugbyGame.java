package hillel.homework.lesson6;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RugbyGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int players = 25;//scanner.nextInt();//25
        int lowAge = 18;//scanner.nextInt();//18
        int highAge = 40;//scanner.nextInt();//40

        int[] firstTeam = randomAgeTeam(players, lowAge, highAge);
//        System.out.println();
//        averageAge(firstTeam);
        int averageAge1 = 0;
        for (int i = 0; i < firstTeam.length; i++) {
            if (i == firstTeam.length - 1) {
                averageAge1 += firstTeam[i];
                averageAge1 = averageAge1 / players;
                System.out.println(averageAge1);
            } else {
                averageAge1 += firstTeam[i];
            }
        }

        int[] secondTeam = randomAgeTeam(players, lowAge, highAge);
        System.out.println();
//        averageAge(secondTeam);
//        System.out.println("average 2");
        int averageAge2 = 0;
        for (int i = 0; i < secondTeam.length; i++) {
            if (i == secondTeam.length - 1) {
                averageAge2 += secondTeam[i];
                averageAge2 = averageAge2 / players;
                System.out.println(averageAge2);
            } else {
                averageAge2 += secondTeam[i];
            }
        }
    }

    public static int[] randomAgeTeam(int players, int lowAge, int highAge) {
        int[] arrayAge = new int[players];
//        int sum = 0;
        for (int i = 0; i < arrayAge.length; i++) {
            int randomAge = ThreadLocalRandom.current().nextInt(lowAge, highAge);//вивод рандомного чісла
            arrayAge[i] = randomAge; //здесь счетчік ставіт індекс масіва і прісваевает рандомное чісло к єтому індексу
            System.out.print(" " + arrayAge[i]);
        }
        return arrayAge;
    }
   /* public static void averageAge(int[] averAgeTeam) {
        int players = 25;//scanner.nextInt();//25
        int lowAge = 18;//scanner.nextInt();//18
        int highAge = 40;//scanner.nextInt();//40

        int sumAverage = 0;
        averAgeTeam = randomAgeTeam(players, lowAge, highAge);

    }*/

}
