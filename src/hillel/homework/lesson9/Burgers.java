package hillel.homework.lesson9;

public class Burgers {
    private String bun;
    private int quantity;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public void classicBurger() {
        System.out.println("Класичний бургер");
        System.out.println("Склад: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public void dietBurger() {
        System.out.println("Дієтичний бургер");
        System.out.println("Склад: " + bun + ", " + meat + ", " + cheese + ", " + greens);
    }

    public void doubleBurger() {
        System.out.println("Double бургер");
        System.out.println("Склад: " + bun + ", " + quantity + "-" + meat + ", " + cheese + ", " + greens + ", " + mayonnaise);
    }

    public Burgers(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public Burgers(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }

    public Burgers(String bun, int quantity, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.quantity = quantity;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }
}

class BurgerMain {
    public static void main(String[] args) {
        Burgers classicBurger = new Burgers("булочка", "м'ясо", "сир", "зелень", "майонез");
        classicBurger.classicBurger();

        Burgers dietBurger = new Burgers("булочка", "м'ясо", "сир", "зелень");
        dietBurger.dietBurger();

        Burgers doubleBurger = new Burgers("булочка", 2, "м'яса", "сир", "зелень", "майонез");
        doubleBurger.doubleBurger();
    }
}