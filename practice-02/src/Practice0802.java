import java.util.Arrays;
import java.util.Scanner;

public class Practice0802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100 사이의 정수를 입력하세요: ");
        int num = scanner.nextInt(); // 숫자 입력
        int arr[] = new int[num]; // 입력한 정수만큼 배열 생성

        for ( int i = 0; i<num; i++) {
            int ran = (int)(Math.random()*100+1);
            arr[i] = ran;
            // 안겹치게 하기 위해 검토
            for (int j =0; j<=i; j++) {
                while (arr[i] != arr[j]) {
                    break;
                }; // 겹치는 수가 나오면 안 겹칠 때까지 랜덤값 반복
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
