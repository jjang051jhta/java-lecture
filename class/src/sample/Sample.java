package sample;

public class Sample {
    public int a;
    private int b;
    public int c;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // field멤버는 private막고
    // 메서드를 통해서 외부로 노출시킨다.


}