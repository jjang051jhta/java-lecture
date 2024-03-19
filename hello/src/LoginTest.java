import java.util.Scanner;

public class LoginTest {
    public static void main(String[] args) {
        //아이디와 비번을 입력받아서 jhta, 1234면 로그인 ,
        //아니면 아이디 비번 확인해주세요. 출력하기
        //String id = "jhta";  //인천시 ㅓㅓ라 204-11 jhta
        //String pw = "1234";
        // String Constant pool
        // new String heap 영역에 저장됨...
        //저장되는 곳이 다름...
        // 스트링 비교할때 == 메모리에 주소 비교
        // equals는 내용 비교
//        String objId = new String("jhta");
//        System.out.println(id=="jhta");
//        System.out.println(id.equals(objId));
        System.out.println("아이디 패스워드 입력해주세요.");
        // String 비교할때 ==은 주소 비교,
        // equals(스트링)은 값을 비교 (주소가 달라도 된다.)
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        String pw = scanner.nextLine();
        System.out.printf("id==%s,pw==%s",id,pw);
        if((id.equals("jhta")) && (pw.equals("1234"))) {
            System.out.println("로그인 되었습니다.");
        } else  {
            System.out.println("아이디 비번 확인해 주세요 ");
        }
    }
}
