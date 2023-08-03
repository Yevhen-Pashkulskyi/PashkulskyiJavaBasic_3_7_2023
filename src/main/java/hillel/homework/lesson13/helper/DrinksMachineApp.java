package hillel.homework.lesson13.helper;

import java.util.Scanner;

public class DrinksMachineApp {
    private static int totalDrinksCount = 0;
    private static double totalCost = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Drinks Machine!");
        String buttonExitOrder = "EXIT";
        while (true) {
            System.out.println("Choose a drink: COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA");
            String choice = scanner.nextLine().toUpperCase();

            if (choice.equals(buttonExitOrder)) {
                break;
            }

            try {
                DrinksMachine drinksMachine = DrinksMachine.valueOf(choice);
                makeDrink(drinksMachine);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("If this is your entire order, enter exit");
        }

        System.out.println("You ordered " + totalDrinksCount + " drinks.");
        System.out.println("Total cost: $" + totalCost);
    }

    private static void makeDrink(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                System.out.println("Making COFFEE. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.COFFEE_PRICE;
                break;
            case TEA:
                System.out.println("Making TEA. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.TEA_PRICE;
                break;
            case LEMONADE:
                System.out.println("Making LEMONADE. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.LEMONADE_PRICE;
                break;
            case MOJITO:
                System.out.println("Making MOJITO. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                System.out.println("Making MINERAL WATER. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                System.out.println("Making COCA COLA. Enjoy!");
                totalDrinksCount++;
                totalCost += Drinks.COCA_COLA_PRICE;
                break;
        }
    }

    public static void orderMultipleDrinks(int numberOfDrinks) {
        if (numberOfDrinks <= 0) {
            System.out.println("Invalid number of drinks.");
            return;
        }

        for (int i = 0; i < numberOfDrinks; i++) {
            System.out.println("Choose a drink: COFFEE, TEA, LEMONADE, MOJITO, MINERAL_WATER, COCA_COLA");
            String choice = new Scanner(System.in).nextLine().toUpperCase();

            try {
                DrinksMachine drinksMachine = DrinksMachine.valueOf(choice);
                makeDrink(drinksMachine);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
                i--;
            }
        }
    }
}
