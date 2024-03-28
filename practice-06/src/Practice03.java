import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        System.out.println("나라이름과 인구수를 입력하시오.");
        Map<String, Integer> nationList = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("나라이름, 인구 ===>");
            String nation = scanner.next();
            if (nation.equals("그만")) break;
            int num = scanner.nextInt();
            nationList.put(nation, num);
        }
        while (true) {
            System.out.println("나라이름을 입력하면 인구수를 알려드립니다. ===> ");
            String nation = scanner.next();
            if (nation.equals("그만")) break;

            Integer num = nationList.get(nation);
            if (num != null) {
                System.out.println(nation + "의 인구는 " + num + "입니다.");
            } else {
                System.out.println("리스트에 없는 나라입니다.");
            }
//            if(nationList.containsKey(nation)) {
//                int num = nationList.get(nation);
//                System.out.println(nation+"의 인구는 "+num+"입니다.");
//            } else {
//                System.out.println("리스트에 없는 나라입니다.");
//            }
        }
    }
}
