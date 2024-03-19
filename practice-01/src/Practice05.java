import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오.");
        int num01 = scanner.nextInt();  //15
        int num02 = scanner.nextInt();  //20
        int num03 = scanner.nextInt();  //10
        // 1 1 10
        // 수학의 8대 난제 3, 3, 3
        if(  ((num01 + num02) < num03 ) ||
             ((num01 + num03) < num02 ) ||
             ((num02 + num03) < num01 )
        ) {
            System.out.println("삼각형이 될 수 없습니다.");
        } else {
            System.out.println("삼각형이 될 수 있습니다.");
        }
    }
}
