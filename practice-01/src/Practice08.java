import java.util.Scanner;

public class Practice08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        String operator = scanner.next();
        int second = scanner.nextInt();
        int result = 0;
        if (operator.equals("+")) {
            result = first + second;
        } else if (operator.equals("-")) {
            result = first - second;
        } else if (operator.equals("*")) {
            result = first * second;
        } else if (operator.equals("/")) {
            result = first / second;
        }
        System.out.printf("%d %s %d연산결과는 %d",first,operator,second,result);
    }
}
