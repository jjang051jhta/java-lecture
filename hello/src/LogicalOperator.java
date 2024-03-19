public class LogicalOperator {
    public static void main(String[] args) {
        // > (크다) < (작다) >= (크거나 같다) <= (작거나 같다)
        // == (같다) !=  (다르다)

        /*System.out.println(3 > 2);
        System.out.println(3 < 2);
        System.out.println('a' > 'b');
        System.out.println('a' == 'a');
        System.out.println('a' == 'A');
        System.out.println(3 != 2);
        System.out.println(3 == 2);*/
        // 비교 연산
        System.out.printf("3 > 2 = %b%n",3 > 2);
        System.out.printf("3 < 2 = %b%n",3 < 2);
        System.out.printf("'a' > 'b' =  %b%n",'a' > 'b');
        System.out.printf("'a' == 'a' = %b%n",'a' == 'a');
        System.out.printf("'a' == 'A' =  %b%n",'a'=='A');
        System.out.printf("3 != 2 = %b%n",3 != 2);
        System.out.printf("3 == 2 =  %b%n",3 == 2);
        System.out.printf("!true = %b%n",!true);
        System.out.printf("!false = %b%n",!false);
        System.out.println((3 > 2) &&  (3 > 4));
        System.out.println((3 > 2) || (3 > 4));
        System.out.printf("(3 > 2) ^ (3 > 4) = %b%n",(3 > 2) ^ (3 > 4));
        System.out.printf("(3 > 2) ^ (3 < 4) = %b%n",(3 > 2) ^ (3 < 4));

        // ^ XOR 두개의 결과가 같으면 false, 다르면 true


        //엄친아의조건
        int height = 180;
        int money = 100000000;
        int iq = 150;
        int myHeight= 182;
        int myMoney = 1000000;
        int myIq = 130;
        System.out.println((myHeight >= height) || (myMoney>=money) || (myIq >= iq));
    }
}
