package hillel.homework.lesson10.point;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


// TODO: 22.07.2023 Створит клас Point - точка на площині. Будемо вважати, що координати цілі значення щоб не ускладнювати задачу. Передбачити наступний функціонал:
//змінити або отримати поточні координати;
//розрахувати відстань до іншої точки;
//розрахувати відстань між двома точками;
//додати можливість порівнювати дві точки - точки вважаються рівними, якщо їх координати співпадають;
//перевизначити метод toString();
//додати можливість створювати копію обʼєкту (через метод clone та конструктор копіювання)
//Застосувати знання по ООП та класу Object. Уникати дублювання коду. 
public class Point implements Cloneable {
    private int xAxis;
    private int yAxis;

    public Point(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public double getxAxis() {
        return xAxis;
    }

    public double getyAxis() {
        return yAxis;
    }

    public double distanceTo(Point other) {
        double dx = this.xAxis - other.xAxis;
        double dy = this.yAxis - other.yAxis;
        return sqrt(pow(dx, 2) + pow(dy, 2));
    }

    public static double distanceBetween(Point firstPoint, Point secondPoint) {
        return firstPoint.distanceTo(secondPoint);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return Double.compare(xAxis, other.xAxis) == 0 && Double.compare(yAxis, other.yAxis) == 0;
    }

    @Override
    public String toString() {
        return xAxis + " " + yAxis;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Point(xAxis, yAxis);
    }
}


