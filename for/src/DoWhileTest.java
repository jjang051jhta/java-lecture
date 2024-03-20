public class DoWhileTest {
    public static void main(String[] args) {
        //a~z 까지 출력 do while 문 이용
        /*int i=0;
        do {
            System.out.print(i+"\t");
            i++;
        }
        while (i<10);*/
        char ch = '가'; // 소문자 a= 97  대문자 A = 65
        System.out.print(ch+1);
        int count= 0;
        do {
            System.out.print(ch);
            ch = (char)(ch + 1);
            count++;
        } while (ch <= '힣');
        System.out.println(count);
    }
}
