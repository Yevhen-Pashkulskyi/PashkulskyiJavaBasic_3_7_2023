package hillel.homework.lesson8;

public class PersonInfo {
    private String firstName;
    private String surname;
    private String city;
    private String phoneNumber;

    public static void main(String[] args) {
        PersonInfo person = new PersonInfo(" Will ", " Smith ", " New York ", " 2936729462846");
        person.personInfo();
        person = new PersonInfo(" Jackie ", " Chan ", " Shanghai ", " 12312412412");
        person.personInfo();
        person = new PersonInfo(" Sherlock ", " Holmes ", " London ", " 37742123513");
        person.personInfo();

    }

    public void personInfo() {
        System.out.println("Зателефонувати громадянинові" + firstName + surname + "з міста" + city + "можна за номером" + phoneNumber + ".");
    }

    private PersonInfo(String firstName, String surname, String city, String phoneNumber) {

        this.firstName = firstName;
        this.surname = surname;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }


}

