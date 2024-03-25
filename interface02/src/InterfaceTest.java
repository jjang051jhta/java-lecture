//인터페이스는 많이 쓴다.
public class InterfaceTest {
    public static void main(String[] args) {
        PolarBear polarBear = new PolarBear();
        polarBear.swim();
        Huntable hunter = new Cat();

        Swimmable swimmer = new Penguin();

        Huntable hunterList[] = {polarBear, hunter};
    }
}
