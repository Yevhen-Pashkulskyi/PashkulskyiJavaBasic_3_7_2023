package hillel.homework.lesson14.verificationLoginAndPassword;

import hillel.homework.lesson14.verificationLoginAndPassword.exception.*;


import java.util.Scanner;

public class UserVerification {
    private static final int COUNTER = 3;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int attemptCounter = 0;

        while (true) {

            try {
//                System.out.println("Enter login: ");
                String login = "qwerty";//scanner.nextLine();
//                System.out.println("Enter password: ");
                String password = "veryLongPassword12345";//scanner.nextLine();
//                System.out.println("Enter confirm password: ");
                String confirmPassword = "veryLongPassword12345";//scanner.nextLine();

                User user = new User(login, password, confirmPassword);
                System.out.printf("Congratulations %s ! Your created successfully!\n\n", user.getLogin());
                break;

            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println("ERROR! " + e.getMessage());

                attemptCounter++;
            }
            if (attemptCounter >= COUNTER) {
                System.out.println("No more attempts, please try again later !\n");
                break;
            }
        }
        System.out.println("Thank you for using our service");
    }
}
