package hillel.homework.lesson9.fitnessTracker;

import java.util.Date;

public class Person {
    public static void main(String[] args) {

        PersonInfo judiMcnamara = new PersonInfo("Judi", "Mcnamara", 18, 3, 2001, "judimcnamara@gmail.com", "335902302393", 80, 110, 80, 10000);
        judiMcnamara.getAge(2023);
        judiMcnamara.printAccountInfo();

        PersonInfo nikSeagal = new PersonInfo("Nik", "Seagal", 1, 12, 1986, "nikseagal@example.com", "320985209385", 85, 110, 80, 10000);
        nikSeagal.getAge(2023);
        nikSeagal.printAccountInfo();

        PersonInfo michaelJordan = new PersonInfo("Michael", "Jordan", 17, 02, 1963, "michealjordan@gmail.com", "133432098104", 90, 150, 90, 12000);
        michaelJordan.getAge(2023);
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
