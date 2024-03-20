import java.util.Arrays;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        //10 , 5, 20
        for(int i=0;i<5;i++){
            int num = scanner.nextInt();
            arr[i] = num;
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr)+"중 가장 큰 숫자는 "+max);


    }
}
