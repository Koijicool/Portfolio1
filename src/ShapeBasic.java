public class ShapeBasic implements Shape {

    private String name;
    private double x1,y1,x2,y2,x3,y3,x4,y4;
    private double pointx,pointy;
    private double radius;



    public ShapeBasic(String name, double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double pointx, double pointy, double radius) {
        this.name = name;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
        this.pointx = pointx;
        this.pointy = pointy;
        this.radius = radius;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPointx() {
        return pointx;
    }

    public void setPointx(double pointx) {
        this.pointx = pointx;
    }

    public double getPointy() {
        return pointy;
    }

    public void setPointy(double pointy) {
        this.pointy = pointy;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calArea() {
        return 0;
    }

    @Override
    public double[] findCenter() {

        return new double[0];
    }

    @Override
    public double circumference() {
        return 0;
    }

    @Override
    public boolean insideShape() {
        return false;
    }
}
