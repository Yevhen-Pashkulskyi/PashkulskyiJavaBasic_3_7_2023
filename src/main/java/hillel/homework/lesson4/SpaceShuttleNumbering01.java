package hillel.homework.lesson4;

import java.util.Scanner;

public class SpaceShuttleNumbering01 {
//    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first not happy number :");
        int firstNotHappy = scanner.nextInt(); //4
        System.out.println("Input second not happy number :");
        int secondNotHappy = scanner.nextInt(); //9
        System.out.println("Input number of shuttles :");
        int maxShuttle = scanner.nextInt(); //100
//        int[] numbersNotHappy = {firstNotHappy, secondNotHappy};

        exclusionOfNumbers(firstNotHappy, secondNotHappy, maxShuttle);

    }

    public static void exclusionOfNumbers(int firstNotHappy, int secondNotHappy, int maxShuttle) { //int[] numbersNotHappy
//        Scanner scanner = new Scanner(System.in);
//        firstNotHappy = 4;
        String txtFirstNowHappy = Integer.toString(firstNotHappy);
//        secondNotHappy = 9;
        String txtSecondNowHappy = Integer.toString(secondNotHappy);

        int startCounShuttle = 0;
//        maxShuttle = 100;

        for (int i = 1; i >= 0; i++) { // i - number of shuttle, start with 1
            String iStr = Integer.toString(i);

            if (iStr.contains(txtFirstNowHappy) | iStr.contains(txtSecondNowHappy)) {
                continue;
            } else if (startCounShuttle >= maxShuttle) {
                break;
            } else {
                startCounShuttle += 1;
                i = Integer.parseInt(iStr);
                System.out.println(startCounShuttle + " шатл " + " має номер " + i);
            }

        }

    }
     /* public static int[] dataInput(int[] firstNumbersNotHappy) {
        Scanner scanner = new Scanner(System.in); //нагадай де ввести цей клас щоб він працював во всіх методах

        int firstInputNotHappy = scanner.nextInt();
        int secondInputNotHappy = scanner.nextInt();
        int maxShuttle = scanner.nextInt();

        return new int[]{firstInputNotHappy, secondInputNotHappy, maxShuttle};
    }*/
}
