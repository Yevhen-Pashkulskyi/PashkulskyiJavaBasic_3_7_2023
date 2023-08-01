package hillel.homework.lesson13;

public class IPhones implements Smartphoneable, IOSable {
    @Override
    public void call() {
        System.out.println("call iphone !");
    }

    @Override
    public void sms() {
        System.out.println("received sms in iphone");
    }

    @Override
    public void internet() {
        System.out.println("connecting internet with iphone");
    }

    @Override
    public void downloadIcon() {
        System.out.println("\uD83C\uDF4F");
    }
}
