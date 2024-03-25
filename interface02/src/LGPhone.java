public class LGPhone implements MobilePhoneInterface, MP3Interface {
    @Override
    public void sendCall() {
        System.out.println("전화를 겁니다.");
    }
    @Override
    public void receiveCall() {
        System.out.println("전화 왔어요.");
    }
    @Override
    public void sendSMS() {
        System.out.println("메세지를 보냅니다.");
    }
    @Override
    public void receiveSMS() {
        System.out.println("메세지를 받습니다.");
    }

    @Override
    public void play() {

    }

    @Override
    public void stop() {

    }
}
