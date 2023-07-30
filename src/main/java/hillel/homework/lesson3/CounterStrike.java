package hillel.homework.lesson3;

import static java.lang.Math.round;
import static java.lang.Math.random;

public class CounterStrike {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введить ім'я команди №1 :");
        String nameTeam1 = "Police";  //scanner.nextLine();

        int firstCop = (int) round(random() * 50);
        int secondCop = (int) round(random() * 50);
        int thirdCop = (int) round(random() * 50);
        int fourthCop = (int) round(random() * 50);
        int fifthCop = (int) round(random() * 50);

        int policeAvgFrag = (firstCop + secondCop + thirdCop + fourthCop + fifthCop) / 5;

//        System.out.println("Введить ім'я команди №2 :");
        String nameTeam2 = "Terrorist"; //scanner.nextLine();

        int firstTerrorist = (int) round(random() * 50);
        int secondTerrorist = (int) round(random() * 50);
        int thirdTerrorist = (int) round(random() * 50);
        int fourthTerrorist = (int) round(random() * 50);
        int fifthTerrorist = (int) round(random() * 50);

        int terroristAvgFrag = (firstTerrorist + secondTerrorist + thirdTerrorist + fourthTerrorist + fifthTerrorist) / 5;

        if (policeAvgFrag > terroristAvgFrag) {
            System.out.println("Перемогла команда " + nameTeam1 + " набрала " + policeAvgFrag + " очків");
        } else if (policeAvgFrag < terroristAvgFrag) {
            System.out.println("Перемогла команда " + nameTeam2 + " набрала " + terroristAvgFrag + " очків");
        } else {
            System.out.println("Нічья кожна команда набрала однаково по " + policeAvgFrag + " очків");
        }

    }
}
