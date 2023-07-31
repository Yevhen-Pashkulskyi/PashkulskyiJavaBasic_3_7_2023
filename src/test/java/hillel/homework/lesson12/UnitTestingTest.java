package hillel.homework.lesson12;

public class UnitTestingTest {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 8, 3, 2};
        UnitTesting testing = new UnitTesting();
        System.out.println(testing.averageArray(array));

        int[][] arrayArray = new int[3][3];
        System.out.println(testing.checkIntegerArraySquare(arrayArray));

    }
}


