package hillel.homework.lesson12;

public class UnitTesting {

    public int averageIntegerArray(int[] array) {
        int average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public double averageDoubleArray(double[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return average / array.length;
    }

    public String checkIntegerArraySquare(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
            if (array.length == array[i].length) {

                return "The array is a square";
            }

        }
        return "The array not is a square";
    }

}

class Main {
    public static void main(String[] args) {
        double[] array = {1.1, 6.3, 7.223, 8.0, 3, 2};
        UnitTesting testing = new UnitTesting();
        System.out.println(testing.averageDoubleArray(array));

        int[][] arrayArray = new int[3][3];
        System.out.println(testing.checkIntegerArraySquare(arrayArray));

    }
}
