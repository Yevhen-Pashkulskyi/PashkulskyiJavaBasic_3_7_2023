package hillel.homework.lesson13.drinkMachine;

public abstract class DrinksMachine {
    private static int totalDrinksCount = 0;

    private static double totalCost = 0;

    public static int getTotalDrinksCount() {
        return totalDrinksCount;
    }

    public static double getTotalCost() {
        return totalCost;
    }

    public static void makeDrink(Drinks drinks) {
        switch (drinks) {
            case COFFEE:
                coffeeProcessMaking();
                totalCost += MenuPrices.COFFEE;
                break;
            case TEA:
                teaProcessMaking();
                totalCost += MenuPrices.TEA;
                break;
            case LEMONADE:
                lemonadeProcessMaking();
                totalCost += MenuPrices.LEMONADE;
                break;
            case MOJITO:
                mojitoProcessMaking();
                totalCost += MenuPrices.MOJITO;
                break;
            case MINERAL_WATER:
                mineralWatterProcessMaking();
                totalCost += MenuPrices.MINERAL_WATTER;
                break;
            case COCA_COLA:
                cocaColaProcessMaking();
                totalCost += MenuPrices.COCA_COLA;
                break;
        }
        totalDrinksCount++;
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
