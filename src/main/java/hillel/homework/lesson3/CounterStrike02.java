package hillel.homework.lesson3;

import java.util.Scanner;

public class CounterStrike02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кол-во команд ");
        int totalTeam = scanner.nextInt();
        String nameTeam = scanner.nextLine();
        int player = 5;
        int counter = 1;
        int counterFrag = 1;
        while (counter <= totalTeam) {
            System.out.println("Enter name team " + counter);
            nameTeam = scanner.nextLine();
            while (counterFrag <= player) {
                System.out.println("Enter frag player " + counterFrag + " team " + nameTeam);
                int frag = scanner.nextInt();
                counterFrag++;
            }
            counter++;
        }

    }
}
