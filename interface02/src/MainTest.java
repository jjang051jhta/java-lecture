public class MainTest {
    public static void main(String[] args) {
        //유연하게
        // Connectable
        // connection();
        //Connectable oracleDB = new MariaDB();
        MobilePhoneInterface smartPhone = new LGPhone();
        smartPhone.sendCall();
        smartPhone.receiveCall();
        smartPhone.sendSMS();
        smartPhone.receiveSMS();
    }
}
