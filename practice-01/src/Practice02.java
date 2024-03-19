import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("두자리 정수를 입력하시오.");
        int num = scanner.nextInt();
        int ten = num/10;
        int one = num%10;
        if(ten==one) {
            System.out.println("십의 자리와 일의 자리가 같습니다.");
        } else {
            System.out.println("십의 자리와 일의 자리가 같지 않습니다.");
        }
    }
}
