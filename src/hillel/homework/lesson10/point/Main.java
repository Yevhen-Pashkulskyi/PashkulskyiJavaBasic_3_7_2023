package hillel.homework.lesson10.point;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point firstPoint = new Point(1, 7);
        Point secondPoint = new Point(1, 7);

        System.out.println("Point 1: " + firstPoint);
        System.out.println("Point 2: " + secondPoint);

        System.out.println("Distance from Point 1 to Point 2: " + firstPoint.distanceTo(secondPoint));
        System.out.println("Distance between Point 1 and Point 2: " + Point.distanceBetween(firstPoint, secondPoint));

        System.out.println("equal or unequal  " + firstPoint.equals(secondPoint));

        Point clonePoint = (Point) firstPoint.clone();
        System.out.println("Clone of Point first : " + clonePoint);
    }
}
