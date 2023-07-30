package hillel.homework.lesson10.point;

import static java.lang.Math.*;


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
    StringBuilder sb;
    private static int count;

    public Point(int x, int y) {
        xAxis = x;
        yAxis = y;
        count++;
//        sb = new StringBuilder();
    }

    public int getxAxis() {
        return xAxis;
    }

    public void setxAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setyAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public int getyAxis() {
        return yAxis;
    }

    public double distanceTo(Point other) {
        if (other == null) {
            System.out.println("Error");
            return 0.0;
        }
        return sqrt(pow(this.xAxis - other.xAxis, 2) + pow(this.yAxis - other.yAxis, 2));
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
//    public void print(){
//        System.out.println(count);
//    }
}


