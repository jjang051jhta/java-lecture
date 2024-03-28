import java.util.Collection;
import java.util.Vector;

public class VectorTest {
    public static void test(Vector<Integer> vector) {
        for(int i=0;i<vector.size();i++) {
            System.out.print(vector.get(i)+"\t");
        }
    }
    public static void main(String[] args) {
        //타입추론
        Vector<Integer> vector = new Vector<>();
        // 길이가 없음... 가변적이다.
        vector.add(1);
        vector.add(10);
        vector.add(-1);
        vector.add(1,100);
        vector.set(0,1000);
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println(vector.get(2));
        System.out.println(vector.get(3));
        test(vector);
//        for(int i=0;i<vector.size();i++) {
//            System.out.print(vector.get(i)+"\t");
//        }
        //Collection 사용 많이 함...
        Vector <Point> vector02 = new Vector<>();
        vector02.add(new Point(10,10));
        vector02.add(new Point(10,20));
        vector02.add(new Point(10,30));
        vector02.remove(1);
        System.out.println();
        for(int i=0;i<vector02.size();i++) {
            System.out.println(vector02.get(i).toString());
        }
    }
}
