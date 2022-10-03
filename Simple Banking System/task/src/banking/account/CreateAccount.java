package banking.account;

import java.util.Random;

public class CreateAccount {
    public static String generateCardNum() {
        String bin = "400000";
        Random rnd = new Random();
        String accountIdentifier = String.valueOf(rnd.nextInt(000000000, 999999999));
        String checksum = "9"; //will be Luhn algorithm
        return bin + accountIdentifier + checksum;
    }

    public static String generatePinCode() {
        Random rnd = new Random();
        int pin = rnd.nextInt(0000, 9999);
        return String.valueOf(pin);
    }
}