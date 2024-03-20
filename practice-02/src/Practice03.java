import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수입력하면 별을 따다 줌...");
        int total = scanner.nextInt();
        /*for(int i=0;i<total;i++) {
            for(int j = 0;j<total-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        /*for(int i=0;i<total;i++) {
            for(int j = 0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        for(int i=0;i<total;i++) {
            for(int j = 1;j<total - i;j++) {
                System.out.print(" ");
            }
            for(int k = 0;k<i*2+1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //1,3,5,7,9
    }
}
