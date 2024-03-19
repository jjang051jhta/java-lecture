import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        int rest;
        Scanner scanner = new Scanner(System.in);
        System.out.println("금액을 입력하시오.");
        int money = scanner.nextInt();
        //126750
        rest = money/50000;
        System.out.println("오만원권 "+rest+"장");
        money  = money % 50000;
        rest = money/10000;
        System.out.println("만원권 "+rest+"장");
        money  = money % 10000;
        rest = money/5000;
        System.out.println("오천원권 "+rest+"장");
        money  = money % 5000;
        rest = money/1000;
        System.out.println("천원권 "+rest+"장");
        money  = money % 1000;
        rest = money/500;
        System.out.println("오백원 "+rest+"개");
        money  = money % 500;
        rest = money/100;
        System.out.println("백원 "+rest+"개");
        money  = money % 100;
        rest = money/50;
        System.out.println("오십원 "+rest+"개");
        money  = money % 50;
        rest = money/10;
        System.out.println("십원 "+rest+"개");








    }
}
