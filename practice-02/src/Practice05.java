import java.util.Arrays;
import java.util.Scanner;

public class Practice05 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("양의 정수 10개를 쓰시오");
        for(int i=0;i<10;i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("입력한 것들중 3의 배수는===");

        for(int i=0;i<10;i++) {
            if(arr[i]%3==0) {
                System.out.print(arr[i]+"\t");
            }
        }
        //System.out.println(Arrays.toString(arr));
    }
}
