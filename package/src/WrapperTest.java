public class WrapperTest {
    public static void main(String[] args) {
        //int num = "10";
        //int num = Integer.parseInt("10");
        // Boxing 기본 타입을 wrapper class
        // unboxing
//        Integer num = Integer.valueOf("10");
//        int num02 = num.intValue();
        //int num = 10;
        //Integer num02 = 10;
        int num = Integer.parseInt("10");
        boolean aa = Boolean.parseBoolean("true");
        int num01 = 10;
        Integer num02 = Integer.parseInt("10");
        System.out.println(num01==num02);
        System.out.println(aa);

        char ch01 = '4';
        char ch02 = 'F';
        if(Character.isDigit(ch02)) {
            System.out.println("ch01은 숫자형 char입니다.");
        }
        if(Character.isAlphabetic(ch02)) {
            System.out.println("ch02은 캐릭터형 char입니다.");
        }
        String str = "aaa";  // reference 타입인데 기본타입처럼 사용 가능

    }
}
