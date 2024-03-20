public class ForTest01 {
    public static void main(String[] args) {
        //1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10= 55
        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            //System.out.print(i + "\t");
            sum+=i;
            if(i<=9) {
                System.out.print(i + "+");
            } else {
                System.out.print(i + "=");
            }
        }
        System.out.print(sum);
    }
}
