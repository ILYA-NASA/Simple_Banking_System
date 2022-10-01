package banking.account;

import java.util.Random;

public class CreateAccount {
    public static String generateCardNum() {
        int bin = 40000_0;
        int accountIdentifier = 123456789;
        int checksum = 9;
        return String.valueOf(bin + accountIdentifier + checksum);
    }

    public static String generatePinCode() {
        Random rnd = new Random();
        int pin = rnd.nextInt(0000, 9999);
        return String.valueOf(pin);
    }
}