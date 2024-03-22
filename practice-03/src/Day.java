class Day {
    private String work; //하루의 할 일을 나타내는 문자열
    public String get() {
        return work;
    }
    public void set(String work) {
        this.work = work;
    }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work+"입니다.");
    }
}