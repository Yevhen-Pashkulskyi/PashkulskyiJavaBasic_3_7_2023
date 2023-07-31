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

}

