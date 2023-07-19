package hillel.homework.lesson9.fitnessTracker;

public class Person {
    public static void main(String[] args) {
        PersonInfo judiMcnamara = new PersonInfo("Judi", "Mcnamara", 18, 3, 2001, 70, 110, 80, 10000);
        judiMcnamara.getAge(2023);
        judiMcnamara.printAccountInfo();

        PersonInfo nikSeagal = new PersonInfo("Nik", "Seagal", 1, 12, 1986, 85, 110, 80, 10000);
        nikSeagal.getAge(2023);
        nikSeagal.printAccountInfo();

        PersonInfo michaelJordan = new PersonInfo("Michael", "Jordan", 17, 02, 1963, 90, 150, 90, 12000);
        michaelJordan.printAccountInfo();

        judiMcnamara.setSurname("Chan");
        judiMcnamara.setWeight(65);
        judiMcnamara.setSystolicPressurePressure(118);
        judiMcnamara.setDiastolicPressure(76);
        judiMcnamara.printAccountInfo();

        nikSeagal.setStep(12000);
        nikSeagal.printAccountInfo();
    }
}
