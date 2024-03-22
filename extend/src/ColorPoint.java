public class ColorPoint extends Point {
    private String color;
    public void setColor(String color) {
        this.color = color;
    }
    public void show() {
        System.out.printf("컬러는 %s",color);
        super.show(); // recursive
    }
}
