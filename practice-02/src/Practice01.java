public class Practice01 {
    public static void main(String[] args) {
        //while
        /*
        int num=0, sum=0;
        while(num<100) {
            sum+=num;
            num+=2;
        }
        System.out.println(sum);
        */
        int num=0, sum=0;
        for(int i=0;i<100;i+=2) {
            sum+=i;

        }
        System.out.println(sum);
    }
}
