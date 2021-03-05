import java.awt.geom.Point2D;

import static java.lang.Math.*;

public class Triangle extends ShapeBasic {


    public Triangle(String name, double x1, double y1, double x2, double y2, double x3, double y3,double x4,double y4, double pointx, double pointy,double radius) {
        super(name, x1, y1, x2, y2, x3, y3,x4,y4, pointx, pointy, radius);
    }


    public double[] findCenter() {
        double x = (getX1() + getX2() + getX3()) / 3;
        double y = (getY1() + getY2() + getY3()) / 3;
        double a[] = new double[2];
        a[0] = x;
        a[1] = y;
        return a;

    }

    public double circumference() {
        double a = Point2D.distance(getX1(), getY1(), getX2(), getY2());
        double b = Point2D.distance(getX2(), getY2(), getX3(), getY3());
        double c = Point2D.distance(getX3(), getY3(), getX1(), getY1());
        double sum = a + b + c;
        return sum;
    }

    public double calArea() {
        return (int) abs((getX1() * (getY2() - getY3()) + getX2() * (getY3() - getY1()) + getX3() * (getY1() - getY2())) / 2.0);
    }
    double A = calArea();
    double A1 = abs((getX1()*(getPointy()-getY3()) + getPointx()*(getY3()-getY1())+ getX3()*(getY1()-getPointy()))/2.0);
    double A2 = abs((getX1()*(getPointy()-getY2()) + getPointx()*(getY2()-getY1())+ getX2()*(getY1()-getPointy()))/2.0);
    double A3 = abs((getX2()*(getPointy()-getY3()) + getPointx()*(getY3()-getY2())+ getX3()*(getY2()-getPointy()))/2.0);

    public boolean insideShape(){
        return (A == A1+A2+A3);
    }
}


