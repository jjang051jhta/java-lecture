import java.util.Scanner;
import java.util.Vector;

public class Practice01 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scanner= new Scanner(System.in);
        while(true) {
            int num = scanner.nextInt();
            if(num==-1) break;
            vector.add(num);
        }
        int big = vector.get(0);
        for(int i=0;i<vector.size();i++) {
            if(vector.get(i) > big) {
                big = vector.get(i);
            }
       }
        System.out.println("제일 큰 숫자는 "+big);
    }
}



