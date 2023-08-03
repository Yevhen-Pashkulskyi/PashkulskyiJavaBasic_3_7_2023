package hillel.homework.lesson13.drinkMachine;

import java.util.Scanner;

public class DrinksMachineRunner {
    private static int totalDrinksCount = 0;
    private static double totalCost = 0;

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
                DrinksMachine drinksMachine = DrinksMachine.valueOf(enterChoice);
                makeDrink(drinksMachine);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid choice. Please try again.");
            }
            System.out.println("If this is your entire order, enter EXIT");
        }

        System.out.println("You ordered " + totalDrinksCount + " drinks.");
        System.out.println("Total cost: " + totalCost + " ₴");
    }

    private static void makeDrink(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                coffeeProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.COFFEE;
                break;
            case TEA:
                teaProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.TEA;
                break;
            case LEMONADE:
                lemonadeProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.LEMONADE;
                break;
            case MOJITO:
                mojitoProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.MOJITO;
                break;
            case MINERAL_WATER:
                mineralWatterProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.MINERAL_WATTER;
                break;
            case COCA_COLA:
                cocaColaProcessMaking();
                totalDrinksCount++;
                totalCost += MenuPrices.COCA_COLA;
                break;
        }
    }

    private static void coffeeProcessMaking() {
        System.out.println("ground coffee ... making coffee with a water temperature of 85 degrees Celsius");
    }

    private static void teaProcessMaking() {
        System.out.println("making tea with a water temperature of 80 degrees Celsius");
    }

    private static void lemonadeProcessMaking() {
        System.out.println("lemon orange mineral water is poured");
    }

    private static void mojitoProcessMaking() {
        System.out.println("the process of preparing mint and lemon is filled with schweps");
    }

    private static void mineralWatterProcessMaking() {
        System.out.println("mineral water is poured");
    }

    private static void cocaColaProcessMaking() {
        System.out.println("ice cubes are poured into a glass, cola is poured");
    }
}
