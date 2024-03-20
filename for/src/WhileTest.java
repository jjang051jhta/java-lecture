import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args) {

        int i=0;
        while(i<10) {
            System.out.print(i+"\t");
            i++;
        }
        //계속 입력받아서 -1을 입력하면 while 빠져 나가기...
        // 1,3,4,5,67
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        int count = 0;
        //for while  do~while
        while(num != -1) {
            //연산
            sum+=num;
            count++;
            num = scanner.nextInt();
        }
        System.out.println((double)sum / count);
    }
}
