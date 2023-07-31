package hillel.homework.lesson12;

public class Unit {
    public double averageArray(int[] array) {
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            average += array[i];
        }
        return (double) average / array.length;
    }

    public boolean checkIntegerArraySquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rows = matrix.length;
        for (int[] row : matrix) {
            if (row == null || row.length != rows) {
                return false;
            }
        }
        return true;
    }

}

