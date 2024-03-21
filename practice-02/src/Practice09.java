import java.util.Scanner;

public class Practice09 {
    public static void main(String[] args) {
        String computer[] = {"가위","바위","보"};
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 가위바위보게임을 시작합니다. 그만을 입력하면 종료합니다.");
        while(true) {
            System.out.println("가위, 바위,보");
            String myChoice = scanner.nextLine();
            if(myChoice.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            int ran = (int)(Math.random()*3);
            String computerChoice = computer[ran];
            System.out.printf("myChoice = %s, computerChoice = %s",myChoice,computerChoice);
            if(myChoice.equals(computerChoice)) {
                System.out.println();
                System.out.println("비김");
            } else if(
                    myChoice.equals("가위") && computerChoice.equals("보")||
                    myChoice.equals("바위") && computerChoice.equals("가위")||
                    myChoice.equals("보") && computerChoice.equals("바위")

            ) {
                System.out.println();
                System.out.println("당신이 이겼습니다.");
            } else {
                System.out.println();
                System.out.println("당신이 졌습니다.");
            }
        }
    }
}
