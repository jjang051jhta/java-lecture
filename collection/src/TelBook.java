import java.util.HashMap;
import java.util.Scanner;

public class TelBook {
    public static void main(String[] args) {
        HashMap<String, Student> telBook = new HashMap<>();
        telBook.put("장성호",new Student(1,"111-1111"));
        telBook.put("정형돈",new Student(2,"222-2222"));
        telBook.put("정준하",new Student(3,"333-3333"));
        telBook.put("노홍철",new Student(4,"444-4444"));
        telBook.put("박명수",new Student(5,"555-5555"));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String name = scanner.nextLine();
            if(name.equals("그만")) break;
            Student student = telBook.get(name);
            if(student==null) {
                System.out.println("없는 사람입니다.");
            } else {
                System.out.println(student.getId()+"=="+student.getTel());
            }
        }
    }
}
