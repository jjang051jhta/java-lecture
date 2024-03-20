import java.util.Arrays;
import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int num = scanner.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++) {
            int randomInt;
            boolean run;
            do {
                randomInt = (int) (Math.random() * 100) + 1;
                run = false;
                for (int j = 0; j < i; j++) {
                    if (arr[j] == randomInt) {
                        run = true;
                        break;
                    }
                }
            } while (run);
            arr[i] = randomInt;
        }
        System.out.println(Arrays.toString(arr));
    }
}
