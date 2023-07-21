package hillel.homework.lesson9.fitnessTracker;

import java.time.LocalDate;

public class RealisePersonInfo {
    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    private final String email;
    private final String phoneNumber;

    private static int yearToDay = 2023;
    private int age;
    private String surname;
    private int weight;
    private int systolicPressure;

    private int diastolicPressure;

    private int step;

    public String getName() {
        return name;
    }

    public int getDayBirthday() {
        return dayBirthday;
    }

    public int getMonthBirthday() {
        return monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSystolicPressure() {
        return systolicPressure;
    }

    public void setSystolicPressure(int systolicPressure) {
        this.systolicPressure = systolicPressure;
    }

    public int getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(int diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getSurname(String surname) {
        return surname;
    }

    public int getWeight(int weight) {
        return weight;
    }

    public int getSystolicPressure(int systolicPressure) {
        return systolicPressure;
    }

    public int getDiastolicPressure(int diastolicPressure) {
        return diastolicPressure;
    }

    public int getStep(int step) {
        return step;
    }

    public int getAge() {
        return age;
    }

    public RealisePersonInfo(String name, String surname, int dayBirthday, int monthBirthday, int yearBirthday, String email, String phoneNumber, int weight, int systolicPressure, int diastolicPressure, int step) {
        this.name = name;
        this.surname = surname;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.systolicPressure = systolicPressure;
        this.diastolicPressure = diastolicPressure;
        this.step = step;
        age = LocalDate.now().getYear() - yearBirthday;

    }

    public void printAccountInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Date of birth: " + dayBirthday + "." + monthBirthday + "." + yearBirthday);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure: " + "s." + systolicPressure + " / " + "d." + diastolicPressure);
        System.out.println("Step: " + step);
        System.out.println();
    }
}
