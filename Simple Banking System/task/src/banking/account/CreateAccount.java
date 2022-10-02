package banking.account;

import java.util.Random;

public class CreateAccount {
    public static String generateCardNum() {
        String bin = "400000";
        String accountIdentifier = "123456789";
        String checksum = "9";
        return bin + accountIdentifier + checksum;
    }

    public static String generatePinCode() {
        Random rnd = new Random();
        int pin = rnd.nextInt(0000, 9999);
        return String.valueOf(pin);
    }
}