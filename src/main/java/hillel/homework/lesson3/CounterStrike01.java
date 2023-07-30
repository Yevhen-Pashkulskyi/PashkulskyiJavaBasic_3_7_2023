package hillel.homework.lesson3;

import java.util.Scanner;


public class CounterStrike01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameTeam1 = "Navi";

        System.out.println("Введіть фрагі гравця №1 команди " + nameTeam1 + ":");//написать каждого игрока через цикл
        int fragsPlayer1 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №2 команди " + nameTeam1 + ":");
        int fragsPlayer2 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №3 команди " + nameTeam1 + ":");
        int fragsPlayer3 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №4 команди " + nameTeam1 + ":");
        int fragsPlayer4 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №5 команди " + nameTeam1 + ":");
        int fragsPlayer5 = scanner.nextInt();

        double totalFragsTeam1 = fragsPlayer1 + fragsPlayer2 + fragsPlayer3 + fragsPlayer4 + fragsPlayer5;
        totalFragsTeam1 /= 5;

        String nameTeam2 = "Fnatic";

        System.out.println("Введіть фрагі гравця №1 команди " + nameTeam2 + ":");
        fragsPlayer1 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №2 команди " + nameTeam2 + ":");
        fragsPlayer2 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №3 команди " + nameTeam2 + ":");
        fragsPlayer3 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №4 команди " + nameTeam2 + ":");
        fragsPlayer4 = scanner.nextInt();

        System.out.println("Введіть фрагі гравця №5 команди " + nameTeam2 + ":");
        fragsPlayer5 = scanner.nextInt();

        double totalFragsTeam2 = fragsPlayer1 + fragsPlayer2 + fragsPlayer3 + fragsPlayer4 + fragsPlayer5;
        totalFragsTeam2 /= 5;

        if (totalFragsTeam1 > totalFragsTeam2) {
            System.out.println("Перемогла команда " + nameTeam1 + " набрала " + totalFragsTeam1 + " очків");
        } else if (totalFragsTeam1 < totalFragsTeam2) {
            System.out.println("Перемогла команда " + nameTeam2 + " набрала " + totalFragsTeam2 + " очків");
        } else {
            System.out.println("Нічья кожна команда набрала однаково по " + totalFragsTeam1 + " очків");
        }
    }
}
