package hillel.homework.lesson9.fitnessTracker;

public class PersonInfo {
    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    String surname;
    int weight;
    int systolicPressure;
    int diastolicPressure;
    int step;


    public PersonInfo(String name, String surname, int dayBirthday, int monthBirthday, int yearBirthday, int weight, int systolicPressure, int diastolicPressure, int step) {
        this.name = name;
        this.surname = surname;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.weight = weight;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.step = step;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.systolicPressure = pressure;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void outputInformation() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of birth: " + dayBirthday + "." + monthBirthday + "." + yearBirthday);
        System.out.println("Weight: " + weight);
        System.out.println("Pressure: " + "s." + systolicPressure + "/" + "d." + diastolicPressure);
        System.out.println("Step: " + step);
    }
}
