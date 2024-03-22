public class C extends B {

    public C() {
        System.out.println("나는 C 생성자");
    }
    public C(int i) {
        super(i);
        System.out.println("나는 매개변수 "+i+" 가지는 C 생성자");
    }
}
