import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
    public static void main(String[] args) {
        //primitive reference
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[10];
        int arr02[] = {1,2,3,4,5};
        int intArray[] = new int[5];
        int copyArray[] =  intArray;
        copyArray[0] = 10;
        intArray[0] = 20;
        System.out.println(copyArray[0]+"==="+intArray[0]);
        System.out.println(copyArray+"==="+intArray);
        System.out.println(Arrays.toString(arr02));
        // 미리 올라와 있는것들...
        // static 영역에 이미 올라와 있음...
        Math.abs(-10);
        //자바 안에는 엄청나게 많은 객체


        //util함수 있음...
        /*arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;*/
        for(int i=0;i<10;i++){
            arr[i] = i+1;
        }
        for(int i=0;i<10;i++) {
            System.out.println(arr[i]);
        }

        // quiz 다섯개의 숫자를 입력받아 배열을 만든다.
        //  이때 가장 큰 숫자 출력해보기...
        //10, 2, 12, 4, 9
    }
}
