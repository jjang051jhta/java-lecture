public class Hello {
    //코드 작성
    //entry point
    public static void main(String[] args) {
        //자바는 타입을 가진다. 정해진 타입이외에는 쓸 수 없다.
        // 타입 추론이라는게 있는데 나중에
        // 자바의 기본타입  primitive type
        // reference type (array, object)

        boolean isTrue = true;
        char ch = 'a';
        byte by = -128; // 1바이트 정수  -128~127
        short sh = -32768; //2바이트 정수 -32768~32767
        int num = 10;   // 4바이트 정수  4*8
        // 숫자 앞에 0을 붙이면 8진수
        // 0x를 붙이면 16진수
        //0b를 붙이면 2진수
        long longNum = 48398294399L;  // 8바이트 정수
        float fl = 3.14F;
        double dl = 10;
        String str = "java";
        //없다의 의미 null은 기본 타입에는 사용 불가
        //String은 Object이지만  기본 타입처럼 사용가능
        //정수의 default =int
        // 실수의 default = double
        long cardNum = 2134_1234_5678_2351L;
        double bankMoney =  100_000_000_000.0;
        int num01=10, num02=20;
        int num03=20;
        final double PI = 3.14;
        //final을 붙이면 상수가 된다.
        // 값을 바꿀 수 없다.
        double d01 = 10;
        int num05 = (int)d01; // type casting 형(形)변환
        // 작은거는 큰거에 넣을 수 있다.
        // 큰걸 작은거에 집어넣을때는 형변환해서 넣어야 한다.
        // 들어갈 수 있는 거까지 집어넣고 나머지는 자른다.
        System.out.println("num05==="+num05+",d01==="+d01);
        System.out.println(1.9+1.2);
    }
}
