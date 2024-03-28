import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class practice04 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner= new Scanner(System.in);

        while(true) {
            System.out.println("강수량 입력 0을 누르면 종료 ===> ");
            int num = scanner.nextInt();
            if(num==0) break;
            vector.add(num);
            Iterator<Integer> iterator = vector.iterator();
            //10
            int sum = 0;
            while (iterator.hasNext()) {
                int num02 = iterator.next();
                System.out.print(num02+" ");
                sum+=num02;
            }
            System.out.println();
            System.out.println("현재까지 강수량 평균은 " + ( sum / vector.size() ) );
        }
    }
}
