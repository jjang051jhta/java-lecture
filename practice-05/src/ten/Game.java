package ten;

public class Game {
    public void run() {
        Player playerList[] =  new Player[2];
        playerList[0] = new Player("장성호");
        playerList[1] = new Player("장동건");
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        int sec01 = playerList[0].turn();
        int sec02 = playerList[1].turn();
        System.out.println(playerList[0].getName()+"님의 결과는 "+sec01);
        System.out.println(playerList[1].getName()+"님의 결과는 "+sec02);
        System.out.print("승자는 ");
        if(Math.abs(sec01 - 10) < Math.abs(sec02 - 10)) {
            System.out.print(playerList[0].getName()+"님 축하합니다.");
        } else {
            System.out.print(playerList[1].getName()+"님 축하합니다.");
        }
    }
}
