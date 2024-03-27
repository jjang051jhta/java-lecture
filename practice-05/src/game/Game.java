package game;

public class Game {
    private final String arr[] = {"가위","바위","보"};
    private Player player ;
    private Computer computer;

    public Game() {
        player = new Player("철수");
        computer = new Computer("인공지능");
    }
    public void run() {
        while (true) {
            int playerChoice = player.turn();
            int computerChoice = computer.turn(); //1,2,3
            if (playerChoice == 4) {
                break;
            }
            if (playerChoice < 1 || playerChoice > 4) {
                System.out.println("잘못 눌렀습니다.");
            } else {
                System.out.print(player.getName() + "(" + arr[playerChoice - 1] + ") === ");
                System.out.println(computer.getName() + "(" + arr[computerChoice - 1] + ")");
                if (playerChoice == computerChoice) {
                    System.out.println("비겼습니다.");
                } else if (playerChoice == 1 && computerChoice == 3
                        || playerChoice == 2 && computerChoice == 1
                        || playerChoice == 3 && computerChoice == 2) {
                    System.out.println(player.getName() + "님이 이겼습니다.");
                } else {
                    System.out.println(computer.getName() + "님이 이겼습니다.");
                }
            }
        }
    }
}
