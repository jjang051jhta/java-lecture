import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreeInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오");
        int sum=0, num=0;
        for(int i=0;i<3;i++){
            System.out.println( i+1 +"번째 숫자 입력");
            try {
                num = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하세요.");
                num = 0;
                scanner.next();
                i--;
                continue;
            }
            sum+=num;
        }
        System.out.println(sum);
    }
}
