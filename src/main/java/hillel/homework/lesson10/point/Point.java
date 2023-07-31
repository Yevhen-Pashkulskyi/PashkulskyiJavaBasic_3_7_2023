package hillel.homework.lesson10.point;

import java.util.Objects;

import static java.lang.Math.*;

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

    public int getXAxis() {
        return xAxis;
    }

    public void setXAxis(int xAxis) {
        this.xAxis = xAxis;
    }

    public void setYAxis(int yAxis) {
        this.yAxis = yAxis;
    }

    public int getYAxis() {
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
        if (firstPoint == null | secondPoint == null) {
            return 0.0;
        }
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
        return xAxis == other.xAxis && yAxis == other.yAxis;
    }

    @Override
    public int hashCode() {
        return Objects.hash(xAxis, yAxis);
    }

    @Override
    public String toString() {
        return xAxis + " " + yAxis;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


