public class PolarBear extends Mamal implements Swimmable, Huntable {
    @Override
    public void swim() {
        System.out.println("북극바다를 수영합니다. ");
    }

    @Override
    public void hunt() {
        System.out.println("사냥을 잘합니다.");
    }
}
