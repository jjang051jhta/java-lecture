public class Circle {
    int radius;
    String name;

    Circle() {
        radius = 1;
        name="";
    }
    Circle(int radius, String name) {
        this.radius = radius;
        this.name = name;
    }

    public double getArea() {
        return radius*radius*3.14;
    }

    public void aa() {
        getArea();
    }
}
