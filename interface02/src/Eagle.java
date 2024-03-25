public class Eagle extends Bird implements Flyable, Huntable {

    @Override
    public void fly() {
        System.out.println("하늘을 날 수 있습니다.");
    }

    @Override
    public void hunt() {
        System.out.println("사냥을 잘합니다.");
    }
}
