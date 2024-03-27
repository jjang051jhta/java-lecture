import java.util.Random;

public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.abs(-9));
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
        System.out.println(Math.ceil(123/10));
        System.out.println(Math.floor(1.9));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.pow(27,1/3.0));
        System.out.println(Math.PI);
        System.out.println(Math.max(10,2));
        System.out.println(Math.min(10,2));
        System.out.println(Math.random());
        Random random = new Random();
        for(int i=0;i<6;i++) {
            System.out.print(random.nextInt(45)+1+",");
        }


        //  123 개의 게시물을 10개씩 보여주기
        // 총 13개의 page  한번에 보여지는 page 5
        //  1 | 2 | 3 | 4 | 5  >>
    }
}
