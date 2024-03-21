class DogxxException extends RuntimeException {}
public class ThrowException {
    public void sayHello(String msg) {
            msg.equals("fds");
            if (msg.equals("개xx")) {
                throw new DogxxException();
            }
            System.out.println("다함께 외쳐봐요..." + msg);
    }

    public static void main(String[] args) {
        ThrowException throwException = new ThrowException();
        try {
            throwException.sayHello("야호");
            throwException.sayHello("개xx");
        } catch (DogxxException e) {
            System.out.println("DogxxException이 발생했습니다.");
        }
    }
}
