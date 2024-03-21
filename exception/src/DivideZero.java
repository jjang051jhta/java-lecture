import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num01,num02;
        while(true) {

            try {
                System.out.println("수를 입력하시오");
                num01 =  scanner.nextInt();
                System.out.println("어떤 수로 나눌지 입력하시오");
                num02 =  scanner.nextInt();
                System.out.printf("%d를 %d로 나누면 %d입니다."
                        ,num01,num02,num01/num02);
                break;
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (InputMismatchException e) {
                System.out.println("정수를 입력하시오.");
                scanner.next();
            }
            finally {
                System.out.println("나는 무조건 실행");
            }
        }
        // 세개의 정수를 입력받아 합계를 구하시오
        // 이떄 정수가 아닌 값을 적는 인간들이 있을 수 있으니 예외 처리하시오.

//        try {
//            //에외가 발생할 수 있는 실행문
//        } catch (Exception e) {
//            //예외를 어떻게 처리할거냐
//        } finally {
//            //예외발생 여부와 상관없이 무조건 실행해야 하는 문장
//        }
    }
}
