import java.util.Scanner;

public class OperatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하면 시/분/초로 바꿔줍니다.");
        int time = scanner.nextInt();
        int sec = time % 60;
        int min =  (time/60) % 60;  //Math.floor(10.9);
        int hour = (time/60)/60;
        //System.out.println(time+"은=="+hour+"시"+min+"분"+sec+"초입니다.");
        System.out.printf("입력한 숫자 %d는 %d시%d분%d초입니다.",time,hour,min,sec);
        scanner.close();
    }
}
