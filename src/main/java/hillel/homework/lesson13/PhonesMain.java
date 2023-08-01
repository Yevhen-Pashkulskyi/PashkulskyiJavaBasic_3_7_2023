package hillel.homework.lesson13;

public class PhonesMain {
    public static void main(String[] args) {
        Androids androidsPhone = new Androids();
        IPhones iPhones = new IPhones();

        Smartphoneable iphoneSmartponable = iPhones;

        ((IOSable) iPhones).downloadIcon();
        iphoneSmartponable.sms();
        iphoneSmartponable.call();
        iphoneSmartponable.internet();

        ((LinuxOSable) androidsPhone).downloadIcon();
        ((Smartphoneable) androidsPhone).sms();
        ((Smartphoneable) androidsPhone).call();
        ((Smartphoneable) androidsPhone).internet();


    }


}
