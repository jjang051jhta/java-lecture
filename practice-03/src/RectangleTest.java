import java.sql.SQLOutput;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect01 = new Rectangle(2,2,4,4);
        Rectangle rect02 = new Rectangle(1,1,10,10);
        System.out.println(rect02.getX());
        rect01.show();
        rect02.show();
        if(rect02.contatins(rect01)){
            // 궁근한건 김성호에게...
            System.out.println("rect02는 rect01을 포함합니다.");
        }
    }
}
