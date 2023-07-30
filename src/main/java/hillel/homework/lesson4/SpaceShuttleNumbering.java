package hillel.homework.lesson4;

import java.util.Scanner;

public class SpaceShuttleNumbering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first not happy number :");
        int firstNotHappy = scanner.nextInt(); //4
        System.out.println("Input second not happy number :");
        int secondNotHappy = scanner.nextInt(); //9
        System.out.println("Input number of shuttles :");
        int maxShuttle = scanner.nextInt(); //100

        exclusionOfNumbers(firstNotHappy, secondNotHappy, maxShuttle);

    }

    public static void exclusionOfNumbers(int firstNotHappy, int secondNotHappy, int maxShuttle) {
        String txtFirstNowHappy = Integer.toString(firstNotHappy);
        String txtSecondNowHappy = Integer.toString(secondNotHappy);

        int startCounShuttle = 0;

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
}
