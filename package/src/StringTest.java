public class StringTest {
    public static void main(String[] args) {
        // String 생성
        char charList[] = {'a','b','c','d'};
        String str01 = "abcd";  //리터럴 테이블에 생성됨
        String str02 = new String("abcd");
        String str03 = new String(charList);
        String str04 = str02;
        String str05 = "abcd";
        String str06 = new String("abcd");

        System.out.println(str01==str02);
        System.out.println(str04==str02);
        System.out.println(str05==str01);
        System.out.println(str02==str06);
        System.out.println(str02.equals(str06));
        // 스트링 객체는 불변객체.... immutable
        System.out.println(str02.concat(str04));
        System.out.println(str02);


        String test = "abcd";
        System.out.println(test.charAt(0));
        System.out.println(test.concat("efgh"));
        System.out.println(test.toUpperCase());
        System.out.println(test.compareTo("abc"));
        System.out.println(test.contains("abc"));
        System.out.println(test.length());
        System.out.println(test.substring(1));
        System.out.println("동해물과 백두산이 마르고 닳도록 하느님이".substring(0,10)+"...");
        System.out.println("      동해물과 백두산이 마르고 닳도록 하느님이   ".trim().substring(0,10)+"...");
        System.out.println("동해물과 백두산이 마르고 닳도록 하느님이".replace("동해","서해"));
        System.out.println("동해물".indexOf("서"));

        String jumin = "880112-2765432";
        String first = jumin.substring(0,6);
        String second = jumin.substring(7);
        System.out.println(first);
        System.out.println(second);
        boolean isMan = second.charAt(0)=='1' || second.charAt(0)=='3'?true:false;
        System.out.println(isMan);
        System.out.println("   ".isEmpty());
        System.out.println("   ".isBlank());
        //17버전부터
        String aaa = """
                     <html>
                        <head></head>
                        <body></body>
                    </html>
                    """;
        System.out.println(aaa);

        //StringBuffer 가변(mutable)   String 불변(immutable) 객체
        String dd = "ddd";
        System.out.println(dd.hashCode());
        dd = "fff";
        System.out.println(dd.hashCode());
        StringBuffer stringBuffer = new StringBuffer("abcd");
        System.out.println("stringBuffer.hashCode()==="+stringBuffer.hashCode());
        stringBuffer.append("efgh");
        System.out.println("stringBuffer.hashCode()append==="+stringBuffer.hashCode());
        System.out.println(stringBuffer);
        String bbb = "abcd";
        System.out.println("bbb==="+bbb.hashCode());
        bbb =  bbb.concat("efgh");
        System.out.println("bbb concat==="+bbb.hashCode());






        //남자인지 여자인지...


















    }
}
