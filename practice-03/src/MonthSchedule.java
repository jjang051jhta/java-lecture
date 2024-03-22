import java.util.Scanner;

public class MonthSchedule {
    private Day dayList[];

    private Scanner scanner  = null;

    MonthSchedule(int num) {
        //지역변수 (local variable)
        scanner = new Scanner(System.in);
        dayList = new Day[num];
        for(int i=0;i<num;i++) {
            dayList[i] = new Day();
        }
    }
    public void input() {
        // 배열은 0부터 시작...
        System.out.println("날짜를 입력하세요.(1~30)");
        int day = scanner.nextInt();
        day--;
        System.out.println("할일을 입력합니다. 엔터키는 동작 안합니다.");
        String work = scanner.next();
        dayList[day].set(work);
    };
    public void view(){
        System.out.println("해야할 일을 보여줍니다. 날짜를 입력하세요.");
        int day = scanner.nextInt();
        day--;
        System.out.print(day+"에 할일은 ");
        dayList[day].show();
    };
    public void finish() {
        System.out.println("종료합니다.");
    };
    public void run(){

        while(true) {
            System.out.println("todo list (입력 : 1, 보기 : 2, 종료 : 3)");
            int menu = scanner.nextInt();
            if(menu==1) {
                input();
            } else if(menu == 2) {
                view();
            } else {
                finish();
                break;
            }
        }
    };
}



