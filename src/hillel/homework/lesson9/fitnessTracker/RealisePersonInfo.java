package hillel.homework.lesson9.fitnessTracker;

public class RealisePersonInfo {
    private final String name;
    private final int dayBirthday;
    private final int monthBirthday;
    private final int yearBirthday;
    private final String email;
    private final String phoneNumber;

    private static int yearToDay = 2023;
    private int age;
    String surname;
    int weight;
    int systolicPressure;
    int diastolicPressure;
    int step;

    public int getAge() {
        age = yearToDay - yearBirthday;
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
