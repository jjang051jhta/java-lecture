import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        System.out.println(LocalDate.of(2020, 12, 12).format(DateTimeFormatter.ISO_DATE));
        System.out.println(">>");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(str);
        while(true) {
            System.out.println("명령 : ");
            String command = scanner.nextLine();
             //we love java
            if(command.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            //we!우리는
            String word[] = command.split("!");
            int start = stringBuffer.indexOf(word[0]);
            stringBuffer.replace(start,start+word[0].length(),word[1]);
            System.out.println(stringBuffer.toString());
            //we!우리
        }
    }
}
