class FoolException extends Exception {
    String msg = "바보는 좀 아니지 않나?";
}

public class Test {
    public void sayNick(String nick) {
        try {
            if("바보".equals(nick)) {
                throw new FoolException();
            }
            System.out.println("당신의 별명은 "+nick+" 입니다.");
        }catch(FoolException e) {
            System.err.println(e.msg);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.sayNick("바보");
        test.sayNick("야호");
    }
}
