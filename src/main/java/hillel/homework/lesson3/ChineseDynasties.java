package hillel.homework.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class ChineseDynasties {
    public static void main(String[] args) {

        String attackPower = Arrays.toString(dynastys()).replace(",", "");
        attackPower = attackPower.replace("[", "");
        attackPower = attackPower.replace("]", "");

        System.out.println("Total attack power: " + attackPower);
    }

    private static Object[] dynastys() {
        Scanner scaner = new Scanner(System.in);

        String liDynasty = "Li dynasty";
        System.out.println(liDynasty);

        System.out.println("Power warrior:");
        int powerWarrior = scaner.nextInt(); //13

        System.out.println("Power archer:");
        int powerArcher = scaner.nextInt(); //24

        System.out.println("Power horseman:");
        int powerHorseman = scaner.nextInt(); //46

        System.out.println("Numbers of warriors:");
        int numbersOfWarriors = scaner.nextInt(); //860

        int totalAttackLi = numbersOfWarriors * (powerWarrior + powerArcher + powerHorseman);

        String minDynasty = "Min dynasty";
        System.out.println(minDynasty);

        System.out.println("Power warrior:");
        powerWarrior = scaner.nextInt(); //9

        System.out.println("Power archer:");
        powerArcher = scaner.nextInt(); //35

        System.out.println("Power horseman:");
        powerHorseman = scaner.nextInt(); //12

        numbersOfWarriors *= 1.5;

        int totalAttackMin = numbersOfWarriors * (powerWarrior + powerArcher + powerHorseman);

        scaner.close();
        return new Object[]{liDynasty, totalAttackLi, minDynasty, totalAttackMin};

    }
}
