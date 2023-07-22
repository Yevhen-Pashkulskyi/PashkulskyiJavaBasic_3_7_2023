package hillel.homework.lesson10.point;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(8, 9);
        point.String();
        Axis axis = new Axis(5, 7);
        axis.String();
        System.out.println(axis.test(3, 6));
        System.out.println(point.test(12, 10));
    }
}
