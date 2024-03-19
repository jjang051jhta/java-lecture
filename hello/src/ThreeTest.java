import java.util.Scanner;

public class ThreeTest {
    public static void main(String[] args) {
        //입력받은 숫자가 3의 배수인지 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하시오");
        int num = scanner.nextInt();
        if(num%3==0) {
            System.out.println("입력하신 숫자는 3의 배수입니다.");
        }
        else {
            System.out.println("입력하신 숫자는 3의 배수가 아닙니다.");
        }
        // 학점
        scanner.close();
    }
}
