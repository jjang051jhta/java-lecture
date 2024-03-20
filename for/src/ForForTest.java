public class ForForTest {
    public static void main(String[] args) {
        /*for(int i = 1;i<=9;i++) {
            System.out.println();
            for(int j = 1;j<=9;j++) {
                System.out.print(j+"x"+i+"="+i*j);
                System.out.print("\t");
            }
        }*/
        int i=1;
        // continue , break
        while(i<=9) {
            System.out.println();
            int j = 1;

            if(i==5) {
                i++;
                continue;
            }
            while(j<=9) {
                System.out.print(j+"x"+i+"="+i*j +"\t");
                j++;
            }
            i++;
        }
    }
}
