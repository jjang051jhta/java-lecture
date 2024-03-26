class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "point("+x+","+y+")";
    }

    @Override
    public boolean equals(Object obj) {
        Point point = (Point)obj; //다운캐스팅
        if(point.x==x && point.y==y) {
            return true;
        }
        return false;
    }
}
public class ObjectTest {
    public static void showObj(Object object) {
        System.out.println(object.getClass().getName()); //메서드 chaining
        System.out.println(object.hashCode());
        System.out.println(object.toString());
    }
    public static void main(String[] args) {
        Point point = new Point(10,20);
        showObj(point);
        Math.round(2.1);
        //  heap  생성하지 않고도 미리 올려져 있는거
        // static 을 클래스 변수, 함수
        // 미리 메모리에 올락 있는 상태 static 에서 함수 호출할려면 static이어야 한다.
        // 아니면 생성해서 호촐
        //  자바메모리 구조  static  /  heap  / stack
        //  static (class들 여기에 올라감, static으로 선언된것들)
        //  heap  (new Point 인스턴스 만들면 여기에 올라간다. 가비지 컬렉션이 동작하는 곳)
        //  stack (Point p  인스턴스의 참조값이 여기에 저장된다.)
        Point point02 = new Point(10,20);
        Point point03 = point;
        System.out.println(point==point02);
        System.out.println(point==point03);
        System.out.println(point.equals(point02));
        // 기본 타입에서 == 은 값 비교
        // 레퍼런스 타입에서 == 주소 비교
    }
}
