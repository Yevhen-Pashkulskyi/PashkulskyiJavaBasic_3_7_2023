package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongEqualsPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongLengthPasswordException;
import hillel.homework.lesson14.verificationLoginAndPassword.exception.WrongPasswordException;

import java.util.Scanner;

public class UserDemo {
    private static final int COUNTER = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int attemptCounter = 0;

        while (attemptCounter < COUNTER) {
//            try {
            while (attemptCounter < COUNTER) {
                try {
                    System.out.println("Enter login: ");
                    String login = scanner.nextLine();
                    User user = new User(login);
                    continue;
                } catch (WrongLengthPasswordException e) {
                    System.out.println("ERROR! " + e.getMessage());
                }
                attemptCounter++;
            }
            while (attemptCounter < COUNTER) {
                try {
                    System.out.println("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.println("Enter confirm password: ");
                    String confirmPassword = scanner.nextLine();

                    User user = new User(password, confirmPassword);

                    continue;
                } catch (WrongLengthPasswordException e) {
                    System.out.println("ERROR! " + e.getMessage());
                } catch (WrongEqualsPasswordException e) {
                    System.out.println("ERROR! " + e.getMessage());
                } catch (WrongPasswordException e) {
                    System.out.println("ERROR! " + e.getMessage());
                }

                attemptCounter++;
            }


//                System.out.println("Enter login: ");
//                String login = scanner.nextLine();
//                System.out.println("Enter password: ");
//                String password = scanner.nextLine();


//                System.out.println("Enter confirm password: ");
//                String confirmPassword = scanner.nextLine();
//
//                User user = new User(login, password, confirmPassword);
//
//                System.out.println("Confirm with registration! ");
//                break;
//
//            } catch (WrongLoginException e) {
//                System.out.println("ERROR! " + e.getMessage());
//            } catch (WrongLengthPasswordException e) {
//                System.out.println("ERROR! " + e.getMessage());
//            } catch (WrongEqualsPasswordException e) {
//                System.out.println("ERROR! " + e.getMessage());
//            } catch (WrongPasswordException e) {
//                System.out.println("ERROR! " + e.getMessage());
//            }
//            attemptCounter++;
            if (attemptCounter > COUNTER - 1) {
                System.out.println("No more attempts, please try again later !");
                break;
            }
        }
        System.out.println("Thank you for using our service");
    }
}
