import java.awt.geom.Point2D;

public class Circle extends ShapeBasic {
    public Circle(String name, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double pointx, double pointy, double radius) {
        super(name, x1, y1, x2, y2, x3, y3, x4, y4, pointx, pointy, radius);
    }
    public double[] findCenter() {
        double x = getX1();
        double y = getY1();
        double a[] = new double[2];
        a[0] = x;
        a[1] = y;
        return a;
    }

    @Override
    public double calArea() {
        return Math.PI*getRadius()*getRadius();
    }

    @Override
    public double circumference() {
        return 2*Math.PI*getRadius();
    }

    @Override
    public boolean insideShape() {
        return Point2D.distance(getX1(), getY1(), getPointx(), getPointy())<= getRadius();
    }
}
