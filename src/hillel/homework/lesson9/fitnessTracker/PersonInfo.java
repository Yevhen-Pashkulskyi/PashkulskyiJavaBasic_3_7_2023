package hillel.homework.lesson9.fitnessTracker;

public class PersonInfo {
    private String name;
    private int dayBirthday;
    private int monthBirthday;
    private int yearBirthday;
    private String email;
    private String phoneNumber;

    private int age;

    private String surname;

    private int weight;
    private int systolicPressure;
    private int diastolicPressure;
    private int step;

    private String getName(String name) {
        this.name = name;
        return name;
    }

    void setSurname(String surname) {
        this.surname = surname;
    }

    private int getDayBirthday(int dayBirthday) {
        this.dayBirthday = dayBirthday;
        return dayBirthday;
    }

    private int getMonthBirthday(int monthBirthday) {
        this.monthBirthday = monthBirthday;
        return monthBirthday;
    }

    private int getYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
        return yearBirthday;
    }

    private String getEmail(String email) {
        this.email = email;
        return email;
    }

    private String getPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return phoneNumber;
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

    public int getAge(int yearToDay) {
        age = yearToDay - getYearBirthday(yearBirthday);
        return age;
    }

    public PersonInfo(String name, String surname, int dayBirthday, int monthBirthday, int yearBirthday, String email, String phoneNumber, int weight, int systolicPressure, int diastolicPressure, int step) {
        getName(name);
        setSurname(surname);
        getDayBirthday(dayBirthday);
        getMonthBirthday(monthBirthday);
        getYearBirthday(yearBirthday);
        getEmail(email);
        getPhoneNumber(phoneNumber);
        setWeight(weight);
        setSystolicPressurePressure(systolicPressure);
        setDiastolicPressure(diastolicPressure);
        setStep(step);
    }

    public void printAccountInfo() {
        System.out.println("Name: " + getName(name));
        System.out.println("Surname: " + surname);
        System.out.println("Date of birth: " + dayBirthday + "." + monthBirthday + "." + getYearBirthday(yearBirthday));
        System.out.println("Age: " + age);
        System.out.println("Email: " + getEmail(email));
        System.out.println("Phone number: " + getPhoneNumber(phoneNumber));
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Pressure: " + "s." + systolicPressure + " / " + "d." + diastolicPressure);
        System.out.println("Step: " + step);
        System.out.println();
    }
}
