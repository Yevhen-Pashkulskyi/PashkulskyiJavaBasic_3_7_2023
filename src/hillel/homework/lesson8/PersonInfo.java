package hillel.homework.lesson8;

public class PersonInfo {
    String firstName;
    String surname;
    String city;
    String phoneNumber;

    public static void main(String[] args) {
        PersonInfo personWillSmith = new PersonInfo("Will", "Smith", "New York", "2936729462846");
//        personWillSmith.firstName = " Will ";
//        personWillSmith.surname = " Smith ";
//        personWillSmith.city = " New York ";
//        personWillSmith.phoneNumber = " 2936729462846";

        personWillSmith.personInfo();

        PersonInfo personJackieChan = new PersonInfo("Jackie");
//        personJackieChan.firstName = " Jackie ";
//        personJackieChan.surname = " Chan ";
//        personJackieChan.city = " Shanghai ";
//        personJackieChan.phoneNumber = " 12312412412";

        personJackieChan.personInfo();
//
        PersonInfo personSherlockHolmes = new PersonInfo("Sherlock", "Holmes");
//        personSherlockHolmes.firstName = " Sherlock ";
//        personSherlockHolmes.surname = " Holmes ";
//        personSherlockHolmes.city = " London ";
//        personSherlockHolmes.phoneNumber = " 37742123513";
//
        personSherlockHolmes.personInfo();

    }

    public void personInfo() {
        System.out.println("Зателефонувати громадянинові" + firstName + surname + "з міста" + city + "можна за номером" + phoneNumber + ".");
    }

    public PersonInfo(String will, String smith, String city, String phoneNumber) {
        firstName = " Will ";
        surname = " Smith ";
        this.city = " New York ";
        this.phoneNumber = " 2936729462846";
    }

    public PersonInfo(String jackie) {
        firstName = " Jackie ";
        surname = " Chan ";
        city = " Shanghai ";
        phoneNumber = " 12312412412";
    }

    public PersonInfo(String sherlock, String surname) {
        firstName = " Sherlock ";
        this.surname = " Holmes ";
        city = " London ";
        phoneNumber = " 37742123513";
    }
}
