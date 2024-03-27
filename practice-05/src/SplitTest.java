import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.nextLine();
            if(str.equals("그만")) {
                System.out.println("종료합니다....");
                break;
            }
            StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            System.out.println("단어의 갯수는 "+stringTokenizer.countTokens());
            while (stringTokenizer.hasMoreTokens()) {
                System.out.print(stringTokenizer.nextToken()+" ");
            }
            String strArray[] = str.split(" ");
            System.out.println();
            System.out.println(strArray.length);
            System.out.println(Arrays.toString(strArray));
        }
    }
}
