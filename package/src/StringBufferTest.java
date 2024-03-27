import java.util.StringTokenizer;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("a");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append(" pencil")
                    .append(" very nice")
                    .append(" monami")
                    .insert(2,"ballpen ")
                    .delete(8,15)
                    .reverse();
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());

        StringBuffer stringBuffer02 = new StringBuffer("This");
        stringBuffer02.append(" is pencil");
        System.out.println(stringBuffer02);
        stringBuffer02.insert(7, " my");
        System.out.println(stringBuffer02);
        //아무리 생각해도 not null 스위소로우
        stringBuffer02.replace(8,10,"your");
        System.out.println(stringBuffer02);

        stringBuffer02.setLength(3);
        System.out.println(stringBuffer02);

        StringBuffer html = new StringBuffer();
        html.append("<html>")
            .append("<head>")
            .append("</head>")
            .append("<body>")
            .append("</body>")
            .append("</html>");

        StringBuffer js = new StringBuffer();
        js.append("<script>")
                .append("alert('아이디 패스워드가 맞질 않습니다.');")
                .append("</script>");
        String query = "name=장성호&addr=서울&age=30";
        StringTokenizer stringTokenizer = new StringTokenizer(query,"&");
//        for(int i=0;i<stringTokenizer.countTokens();i++) {
//            System.out.println(stringTokenizer.nextToken());
//        }
        while(stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        String splitStr[] = query.split("&");
        System.out.println(splitStr[0]);
        System.out.println(splitStr[1]);
        System.out.println(splitStr[2]);

    }
}
