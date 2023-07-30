package hillel.homework.lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameGuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int tryToGuess; // вибір числа, юзером
        int lowRandom = 0;
        int highRandom = 11;

        System.out.printf("Вгадаї чісло" + " від %d до %d", lowRandom, (highRandom - 1));
        System.out.println();

        System.out.println("Введи кількість спроб :");
        int numberOfAttempts = scanner.nextInt(); //кількість спроб
        int count = 0;
        do {
            count++;
            if (numberOfAttempts >= 3) {
                break;
            } else {
                System.out.println("Не менше 3 :");
                numberOfAttempts = scanner.nextInt();
            }
        } while (numberOfAttempts < 3);

        int randomNumber;
        randomNumber = ThreadLocalRandom.current().nextInt(lowRandom, highRandom); //рандомне число в діапозоні від 0 до 10
        int attemptCounter = 0;
        do {
            attemptCounter++;
            System.out.println(attemptCounter + " cпробa вгадати число ");
            tryToGuess = scanner.nextInt();
            if (tryToGuess == randomNumber) {
                System.out.println("Поздоровляю ти переміг !!!" + " Твій результат" + " та " + "результатк пк = " + tryToGuess);
                break;
            } else if (attemptCounter >= numberOfAttempts) {
                System.out.println("Невірно " + "результат пк = " + randomNumber);
                System.out.println("Ти програв!");
                break;
            } else {
                System.out.println("Невірно спробуй ще");
            }
        } while (attemptCounter < numberOfAttempts);


       /* String[] answerOptions = {
                "Вгадаї число",
                "Ввести кількість спроб :",
                "результат пк = ",
                " cпробa вгадати число ",
                "Твій результат ",
                "Невірно ",
                "Поздоровляю ти переміг !!! ",
                "Ти програв!"
        };*/
       /* for (int j = 0; numberOfAttempts < 3; j++) {
            System.out.println("Не менше 3 :");
            numberOfAttempts = scanner.nextInt();
        }*/
    }
}
