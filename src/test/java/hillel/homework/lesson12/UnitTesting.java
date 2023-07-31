package hillel.homework.lesson12;

public class UnitTesting {
    public static void main(String[] args) {
        int[] array = {1, 6, 7, 8, 3, 2};
        Unit testing = new Unit();
        System.out.println(testing.averageArray(array));

        int[][] arrayArray = new int[3][3];
        System.out.println(testing.checkIntegerArraySquare(arrayArray));

    }
}


