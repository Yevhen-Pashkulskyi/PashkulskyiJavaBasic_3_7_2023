package hillel.homework.lesson12;

public class UnitTesting {
    public double averageArray(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return (double) average / array.length;
    }

    public boolean checkIntegerArraySquare(int[][] array) {
        int line = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
            line = array[i].length;
        }
        return array.length == line;
    }

    public static void main(String[] args) {
        int[] array = {1, 6, 7, 8, 3, 2};
        UnitTesting testing = new UnitTesting();
        System.out.println(testing.averageArray(array));

        int[][] arrayArray = new int[3][3];
        System.out.println(testing.checkIntegerArraySquare(arrayArray));

    }


}

