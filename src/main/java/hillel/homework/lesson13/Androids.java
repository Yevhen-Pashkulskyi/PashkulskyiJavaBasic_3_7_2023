package hillel.homework.lesson13;

public class Androids implements Smartphoneable, LinuxOSable {

    @Override
    public void call() {
        System.out.println("call android phone !");
    }

    @Override
    public void sms() {
        System.out.println("received sms in android phone");
    }

    @Override
    public void internet() {
        System.out.println("connecting internet with android phone");
    }

    @Override
    public void downloadIcon() {
        System.out.println("\uD83E\uDD16");
    }
}
