import java.util.Scanner;

public class RotateText {
    public static void main(String[] args) {
        System.out.println("문자열을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for(int i=0;i<str.length();i++) {
            //ILOVEYOU
            String first = str.substring(0,1);
            String rest = str.substring(1);
            str = rest+first;
            System.out.println(str);
        }
    }
}
