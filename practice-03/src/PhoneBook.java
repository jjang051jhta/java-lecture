import java.util.Scanner;

public class PhoneBook {
    private Scanner scanner = null;
    private Phone phoneList[] = null;

    public PhoneBook() {
        scanner = new Scanner(System.in);
    }

    private void read() {
        System.out.println("몇명 입력할까요?");
        int num = scanner.nextInt();
        phoneList = new Phone[num];
        for (int i = 0; i < num; i++) {
            System.out.println("이름 전화번호 입력하세요.");
            System.out.println("이름을 입력하세요.");
            String name = scanner.next();
            System.out.println("전화번호를 입력하세요.");
            String tel = scanner.next();
            phoneList[i] = new Phone(name, tel);
        }
        System.out.println("전화번호 " + num + "개 저장되었습니다.");
    }

    private void search(String name) {
        boolean isSearch = false;
        for (int i = 0; i < phoneList.length; i++) {
            if (phoneList[i].getName().equals(name)) {
                System.out.println(name + "님의 전화번호는 " + phoneList[i].getTel());
                isSearch = true;
            }
        }
        if (!isSearch) {
            System.out.println("찾는 사람이 없습니다.");
        }
    }

    public void run() {
        read();
        while (true) {
            System.out.println("검색할 이름을 쓰시오.");
            String name = scanner.next();
            if (name.equals("그만")) {
                break;
            }
            search(name);
        }
    }
}