package hillel.homework.lesson13.drinkMachine;

import java.util.Scanner;

public class DrinksMachineRunner extends DrinksMachine {

    private static final String BUTTON_EXIT_ORDER = "EXIT";

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to the Drinks Machine!");

        while (true) {
            System.out.println("Enter the name of the drink: COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA");

            String enterChoice = scanner.nextLine().toUpperCase();

            if (enterChoice.equals(BUTTON_EXIT_ORDER)) {
                break;
            }

            try {
                Drinks drinks = Drinks.valueOf(enterChoice);
                makeDrink(drinks);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("If this is your entire order, enter EXIT");
        }

        System.out.println("You ordered " + getTotalDrinksCount() + " drinks.");
        System.out.println("Total cost: " + getTotalCost() + " ₴");
    }


}
