import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {
        //조건문
        System.out.println("나이를 정수로 입력하시오. 18세 이상만 입장 가능... 홍대 YG 클럽");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt(); //
        System.out.println("장성호" == "장성호");
        if(age>=18) {
            System.out.println("입장하세요.");
        } else {
            System.out.println("집에 가!!!");
        }
        scanner.close();
        //아이디와 비번을 입력받아서 jhta, 1234면 로그인 ,
        //아니면 아이디 비번 확인해주세요. 출력하기
    }
}
