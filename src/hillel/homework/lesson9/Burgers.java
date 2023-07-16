package hillel.homework.lesson9;

public class Burgers {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayonnaise;

    public void compositionBurger() {

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
}

class BurgerMain {
    public static void main(String[] args) {
        Burgers burgers = new Burgers("bun", "meat", "cheese", "greens", "mayonnaise");
        burgers.compositionBurger();
    }
}