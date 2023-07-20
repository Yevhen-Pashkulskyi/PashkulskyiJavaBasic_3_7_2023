package hillel.homework.lesson9.fitnessTracker;

public class CustomerProfile {
    public static void main(String[] args) {

        RealisePersonInfo judiMcnamara = new RealisePersonInfo("Judi", "Mcnamara", 18, 3, 2001, "judimcnamara@gmail.com", "335902302393", 80, 110, 80, 10000);
        judiMcnamara.getAge();
        judiMcnamara.printAccountInfo();

        RealisePersonInfo nikSeagal = new RealisePersonInfo("Nik", "Seagal", 1, 12, 1986, "nikseagal@example.com", "320985209385", 85, 110, 80, 10000);
        nikSeagal.getAge();
        nikSeagal.printAccountInfo();

        RealisePersonInfo michaelJordan = new RealisePersonInfo("Michael", "Jordan", 17, 02, 1963, "michealjordan@gmail.com", "133432098104", 90, 150, 90, 12000);
        michaelJordan.getAge();
        michaelJordan.printAccountInfo();

        judiMcnamara.surname = "Chan";
        judiMcnamara.weight = 65;
        judiMcnamara.systolicPressure = 118;
        judiMcnamara.diastolicPressure = 76;
        judiMcnamara.printAccountInfo();

        nikSeagal.step = 12000;
        nikSeagal.printAccountInfo();
    }
}
