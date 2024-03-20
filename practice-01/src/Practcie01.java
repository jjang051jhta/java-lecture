import java.util.Scanner;

public class Practcie01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("원화를 입력하면 달러로 바꿔줍니다.");
        int won = scanner.nextInt();
        double dollar = won/1300.0;
        System.out.printf("입력한 금액 %d은 달러로 환산하면 %f",won,dollar);
    }
}
