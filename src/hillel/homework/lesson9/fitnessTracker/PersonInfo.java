package hillel.homework.lesson9.fitnessTracker;

public class PersonInfo {
    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    private int age;
    private String surname;
    private int weight;
    private int systolicPressure;
    private int diastolicPressure;
    private int step;


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

    void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSystolicPressurePressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public int getAge(int yearToDay) {
        age = yearToDay - getYearBirthday();
        return age;
    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of birth: " + dayBirthday + "." + monthBirthday + "." + yearBirthday);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure: " + "s." + systolicPressure + " / " + "d." + diastolicPressure);
        System.out.println("Step: " + step);
        System.out.println();
    }
}
