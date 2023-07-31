package hillel.homework.lesson12;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    //    public static void main(String[] args) {
//        int[] array = {1, 6, 7, 8, 3, 2};
//        Unit testing = new Unit();
//        System.out.println(testing.averageArray(array));
//
//        int[][] arrayArray = new int[3][3];
//        System.out.println(testing.checkArraySquare(arrayArray));
//
//    }
    @Test
    public void testAverageArray() {
        Unit unit = new Unit();

        // Тестуємо звичайний масив
        int[] usualArray = {1, 2, 3, 4, 5};
        double firstExpectedAverage = 3.0;
        double actualAverage1 = unit.averageArray(usualArray);
        assertEquals(firstExpectedAverage, actualAverage1, 0.001); // Точність обчислень - 0.001

        // Тестуємо порожній масив
        int[] emptyArray = {};
        double expectedAverage2 = 0.0; // Очікуємо 0.0, бо масив порожній
        double actualAverage2 = unit.averageArray(emptyArray);
        assertEquals(expectedAverage2, actualAverage2, 0.001);

        // Тестуємо масив з одним елементом
        int[] oneElementsArray = {10};
        double expectedAverage3 = 10.0; // Очікуємо 10.0, бо лише один елемент
        double actualAverage3 = unit.averageArray(oneElementsArray);
        assertEquals(expectedAverage3, actualAverage3, 0.001);

        // Тестуємо null
        int[] arrayNull = null;
        double expectedAverage4 = 0.0; // Очікуємо 0.0, бо масив є null
        double actualAverage4 = unit.averageArray(arrayNull);
        assertEquals(expectedAverage4, actualAverage4, 0.001);

    }

    @Test
    public void testCheckIntegerArraySquare() {
        Unit unit = new Unit();

        // Тестуємо квадратну матрицю
        int[][] matrixSquare = new int[3][3];
        assertTrue(unit.checkArraySquare(matrixSquare));

        // Тестуємо неквадратну матрицю
        int[][] matrixNotSquare = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };
        assertFalse(unit.checkArraySquare(matrixNotSquare));

        // Тестуємо порожню матрицю
        int[][] matrixEmpty = {{}};
        assertFalse(unit.checkArraySquare(matrixEmpty));

        // Тестуємо null
        int[][] matrixNull = null;
        assertFalse(unit.checkArraySquare(matrixNull));

    }

}


