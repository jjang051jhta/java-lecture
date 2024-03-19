import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        //switch
        System.out.println("학점을 입력하세요.");
        int score = 88;
        switch(score / 10) {
            // case에 쓸 수 있는 것들
            // 정수 또는 char, String
            case  10:
            case  9:
                System.out.println("A");
                break;
            case  8:
                System.out.println("B");
                break;
            case  7:
                System.out.println("C");
                break;
            case  6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
        System.out.println("메가 커피 주문해 주세요.");
        Scanner scanner = new Scanner(System.in);
        String order = scanner.next();
        switch(order) {
            case "아이스아메리카노":
                System.out.println("1500원입니다.");
                break;
            case "카페라테":
                System.out.println("3000원입니다.");
                break;
            case "카푸치노":
                System.out.println("2500원입니다.");
                break;

            case "십전대보탕" :
                System.out.println("5000원입니다.");
                break;
            default:
                System.out.println("메뉴에 없습니다.");
                break;
        }
    }
}
