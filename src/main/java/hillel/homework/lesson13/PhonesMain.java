package hillel.homework.lesson13;

public class PhonesMain {
    public static void main(String[] args) {
        Androids androidsPhone = new Androids();
        IPhones iPhones = new IPhones();

        IOSable ioSable = iPhones;
        LinuxOSable linuxOSable = androidsPhone;

        Smartphoneable smartphoneableAndroid = androidsPhone;
        Smartphoneable iphoneSmartponable = iPhones;

        ioSable.downloadIcon();
        iphoneSmartponable.sms();
        iphoneSmartponable.call();
        iphoneSmartponable.internet();

        linuxOSable.downloadIcon();
        smartphoneableAndroid.sms();
        smartphoneableAndroid.call();
        smartphoneableAndroid.internet();


    }


}
