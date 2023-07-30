package hillel.homework.lesson4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GameGuessTheNumberExperiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] answerOptions = {
                "Вгадаї число",
                "Ввести кількість спроб :",
                "результат пк ",
                " cпробa ",
                "Твій результат ",
                "Невірно ",
                "Поздоровляю ти переміг !!!",
                "Ти програв!"
        };

        int randomNumber;
        int tryToGuess; // вибір числа, юзером
        int i = 0;

        System.out.println(answerOptions[0]);
        System.out.println(answerOptions[1]);
        int numberOfAttempts = scanner.nextInt(); //кількість спроб

        do {
            i++;
            randomNumber = ThreadLocalRandom.current().nextInt(0, 11);
            System.out.println(i + answerOptions[3]);
            tryToGuess = scanner.nextInt();
            if (i >= numberOfAttempts) {
                System.out.println(answerOptions[5] + answerOptions[2] + randomNumber);
                System.out.println(answerOptions[7]);
                break;
            } else if (tryToGuess == randomNumber) {
                System.out.println(answerOptions[6] + answerOptions[4] + tryToGuess);
            } else {
                System.out.println(answerOptions[5] + answerOptions[2] + randomNumber);
            }
        } while (i < numberOfAttempts);


//        System.out.println(answerOptions.length);  // выдает длину масива в виде числа
        /*for (int i = 0; i < answerOptions.length; i++){

            if (i == 5) {
                break;
            }
            System.out.println(answerOptions[i]);
        }*/
        /*int arraySize = 15;  //можно так задать длину масива из опреденных расчетов

       // еще один способ обьявления масива
        String[] answerOptions = new String[arraySize];
        answerOptions[0] = "1";
        answerOptions[1] = "2";
        answerOptions[2] = "3";
        answerOptions[03] = "4";
        answerOptions[4] = "5";
        System.out.println(answerOptions[3]);*/

    }
}
