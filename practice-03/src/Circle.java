public class Circle {
    private double x,y;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public Circle(double x, double y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show() {
        System.out.printf("좌표(%f,%f) 반지름 %d 인 원",x,y,radius);
    }

    public double getArea() {
        return radius*radius*3.14;
    }
}
