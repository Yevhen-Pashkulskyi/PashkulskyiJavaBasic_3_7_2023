package hillel.homework.lesson12;

public class Unit {
    public double averageArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }

    public boolean checkArraySquare(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        for (int[] row : matrix) {
            if (row == null || row.length != matrix.length) {
                return false;
            }
        }
        return true;
    }

}

