public class MyPoint {
    private int x,y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //재정의
    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }
    @Override
    public boolean equals(Object obj) {
        MyPoint p = (MyPoint)obj;
        if(x == p.x && y == p.y) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint(10,20);
        MyPoint myPoint02 = new MyPoint(10,10);
        System.out.println(myPoint.toString());
        if(myPoint.equals(myPoint02)){
            System.out.println("같은 점");
        } else {
            System.out.println("다른 점");
        }
    }
}
