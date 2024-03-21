import java.util.Arrays;
import java.util.Scanner;

public class Practice0802 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~100 사이의 정수를 입력하세요: ");
        int num = scanner.nextInt(); // 숫자 입력
        int arr[] = new int[num]; // 입력한 정수만큼 배열 생성

        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*100+1); //1~100 랜덤 수 arr 입력
            for(int j=0; j<i; j++) {
                if(arr[j]==arr[i]) {
                    i--;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
