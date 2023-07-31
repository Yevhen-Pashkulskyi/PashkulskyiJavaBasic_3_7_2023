package hillel.homework.lesson10.point;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PointTest {
    @Test
    public void testDistanceTo() {
        Point firestPoint = new Point(0, 0);
        Point secondPoint = new Point(3, 4);
        double expectedDistance = 5.0;
        double actualDistance = firestPoint.distanceTo(secondPoint);
        assertEquals(expectedDistance, actualDistance, 0.001); // Точність обчислень - 0.001

    }

    @Test
    public void testDistanceBetween() {
        Point firestPoint = new Point(0, 0);
        Point secondPoint = new Point(3, 4);
        double expectedDistance = 5.0;
        double actualDistance = Point.distanceBetween(firestPoint, secondPoint);
        assertEquals(expectedDistance, actualDistance, 0.001); // Точність обчислень - 0.001

    }

    @Test
    public void testEquals() {
        Point firestPoint = new Point(2, 3);
        Point secondPoint = new Point(2, 3);
        Point thirdPoint = new Point(4, 5);

        assertEquals(firestPoint, secondPoint);
        assertNotEquals(firestPoint, thirdPoint);

    }

    @Test
    public void testHashCode() {
        Point firestPoint = new Point(2, 3);
        Point secondPoint = new Point(2, 3);
        Point thirdPoint = new Point(4, 5);

        assertEquals(firestPoint.hashCode(), secondPoint.hashCode());
        assertNotEquals(firestPoint.hashCode(), thirdPoint.hashCode());
    }
}


