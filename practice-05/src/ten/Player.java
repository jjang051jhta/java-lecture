package ten;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Scanner;

public class Player {
    private String name;
    Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int turn() {
//        LocalTime localTime01 = LocalTime.now();
//        LocalTime localTime02 = LocalTime.now();
//        Duration duration = Duration.between(localTime02 , localTime01);
//        System.out.println(duration.getNano());
        System.out.println(name + "님 시작 <Enter>");
        String key = scanner.nextLine();
        Calendar calendar = Calendar.getInstance();
        int firstSec = calendar.get(Calendar.SECOND);
        System.out.println("현재 초 시간 = " + firstSec);
        System.out.println("10초 세고 엔터 치세요.");
        key = scanner.nextLine();
        calendar = Calendar.getInstance();
        int endSec = calendar.get(Calendar.SECOND);
        if(firstSec > endSec) {
            endSec += 60;
        }
        System.out.println("현재 초 시간 = " + endSec);
        return Math.abs(endSec - firstSec);
    }
}
