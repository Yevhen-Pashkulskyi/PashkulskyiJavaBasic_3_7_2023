package hillel.homework.lesson3;

import java.util.Scanner;

public class ChineseDynasties01 {
    public static void main(String[] args) {
        System.out.println("Li dynasty total power: " + LiDynasty()); //Arrays.toString(LiDynasty()));
        System.out.println("Min dynasty total power: " + MinDynasty());
    }

    private static Object LiDynasty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Li dynasty");
        System.out.println("Power warrior:");
        int powerWarrior = scanner.nextInt(); //13
        System.out.println("Power archer:");
        int powerArcher = scanner.nextInt(); //24
        System.out.println("Power horseman:");
        int powerHorseman = scanner.nextInt(); //46
        System.out.println("Numbers of warriors:");
        int numbersOfWarriors = scanner.nextInt(); //860

        int totalPower = powerWarrior * numbersOfWarriors + powerArcher * numbersOfWarriors + powerHorseman * numbersOfWarriors;

        return totalPower;

    }

    private static Object MinDynasty() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Min dynasty");

        System.out.println("Power warrior:");
        int powerWarrior = scanner.nextInt();//9

        System.out.println("Power archer:");
        int powerArcher = scanner.nextInt();//35

        System.out.println("Power horseman:");
        int powerHorseman = scanner.nextInt();//12

        double numbersOfWarriors = 860 * 1.5;//860 * 1.5 нужно поискать решения как достать с метода LiDynasty "numbersOfWarriors"

        double totalPower = numbersOfWarriors * powerWarrior + numbersOfWarriors * powerArcher + numbersOfWarriors * powerHorseman;

        scanner.close();

        return totalPower;
    }
}
