import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); // String을 리컨한다.  외부에서 입력한 값을 String으로 바꿔준다.
        System.out.println("나의 이름은 "+name);
        int age = scanner.nextInt();
        System.out.println("나의 나이는 "+age+"입니다.");
        double weight = scanner.nextDouble();
        System.out.println("나의 몸무게는 "+weight+"입니다.");
        scanner.close();
        // 자바는 가비지 컬렉션이 자동으로 쓰지 않는 자원을 수거해 간다.
        // 생성자 함수는 여러개 만들 수 있다.
        // 이런걸 생성자 오버로드라고 부른다
    }
}
