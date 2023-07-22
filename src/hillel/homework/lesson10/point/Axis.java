package hillel.homework.lesson10.point;

import java.beans.PropertyEditorSupport;

public class Axis extends Point {
    public Axis(int x, int y) {
        super(x, y);
    }

    @Override
    public String test(int abscissa, int yAxis) {
        int result = abscissa - yAxis;
        return "x " + result;
    }

    public void String() {
        System.out.println(test(getAbscissa(), getyAxis()));
    }

}
