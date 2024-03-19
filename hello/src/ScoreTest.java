import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = scanner.nextInt();
        String grade = null;
        // 90 이상이면 a
        // 80 이상이면 b
        // 70 이상이면 c
        // 60 이상이면 d
        // 나머지 f
        if(score>=90) {
            grade = "A";
        } else if(score>=80) {
            grade = "B";
        } else if(score>=70) {
            grade = "C";
        } else if(score>=60) {
            grade= "D";
        } else {
            grade= "F";
        }
        System.out.println("grade===" + grade);
        // 점수와 학년을 입력받아 60이상이면 합격
        // 4학년 일때는 70이상이어야 합격


        System.out.println("점수를 입력하세요");
        int point = scanner.nextInt();
        System.out.println("학년을 입력하세요");
        int year = scanner.nextInt();
        if(point>=60) {
            if(year==4) {
                if(point>=70) {
                    System.out.println("합격");
                } else {
                    System.out.println("불합격");
                }
            } else {
                System.out.println("합격");
            }
        } else {
            System.out.println("땡");
        }
    }
}
