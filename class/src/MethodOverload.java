public class MethodOverload {

    //private / prtected / public / default
    // 오버로드(여러개 만들기)    오버라이드(재정의)
    int getSum(int i, int j) {
        return i+j;
    }
    double getSum(double i, double j) {
        return i+j;
    }

    public static void main(String[] args) {
        MethodOverload methodOverload = new MethodOverload();
        int result01 = methodOverload.getSum(10,20);
        double result02 = methodOverload.getSum(10.2,20.4);
        System.out.println(result01+"=="+result02);
    }
}
