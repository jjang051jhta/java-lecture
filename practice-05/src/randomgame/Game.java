package randomgame;

import java.util.Scanner;

public class Game {
    private Person playerList[] = new Person[2];
    private Scanner scanner = new Scanner(System.in);
    public Game() {
        for(int i=0;i< playerList.length;i++) {
            System.out.println(i+1+"번째 선수 입력");
            String name = scanner.nextLine();
            playerList[i] = new Person(name);
        }
    }
    public void run() {
        //2사람이 번갈아 가면서 출력
        int i=0;
        while(true) {
            if(playerList[i].turn()) {
                System.out.println( playerList[i].getName()+"님이 이겼습니다.");
                break;
            } else {
                System.out.println("안타깝네요.");
                i=++i%playerList.length;
            }
        }
    }
}
