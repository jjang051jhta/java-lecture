import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수 3개를 입력하시오.");
        int num01 = scanner.nextInt();  //15
        int num02 = scanner.nextInt();  //20
        int num03 = scanner.nextInt();  //10
        int center = num01;
        if( ( num01 >= num02) && ( num01 <= num03) ||
                ( num01 >= num03) && ( num01 <= num02) ) {
            center = num01;
        } else if( ( num02 >= num01) && ( num02 <= num03) ||
                        ( num02 >= num03) && ( num02 <= num01)) {
            center = num02;
        } else {
            center = num03;
        }
        System.out.println("중간 값은 "+center+"입니다.");
    }
}
