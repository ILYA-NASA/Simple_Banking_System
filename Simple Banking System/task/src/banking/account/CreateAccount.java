package banking.account;

import java.util.Random;

public class CreateAccount {
    public static String generateCardNum() {
        String bin = "400000";
        Random rnd = new Random();
        String accountIdentifier = String.valueOf(rnd.nextInt(100000000, 999999999));
        String checksum = checkSum(bin, accountIdentifier);
        return bin + accountIdentifier + checksum;
    }

    public static String generatePinCode() {
        Random rnd = new Random();
        int pin = rnd.nextInt(1000, 9999);
        return String.valueOf(pin);
    }

    /**
     * method generate last number in card for checks in Luhn algorithm
     */
    public static String checkSum(String bin, String accountIden) {
        String numCard = bin + accountIden;
        int[] numCardArray = new int[numCard.length()];
        int sum = 0;
        for (int i = 0; i < numCard.length(); i++) {
            numCardArray[i] = Integer.parseInt(numCard.substring(i, i + 1));
        }
        for (int i = 0; i < numCardArray.length; i++) {
            if (i % 2 == 0) {
                numCardArray[i] *= 2;
                if (numCardArray[i] > 9) {
                    numCardArray[i] -= 9;
                }
            }
            sum += numCardArray[i];
        }
        int count = 0;
        while (sum % 10 != 0) {
            sum++;
            count++;
        }
        return String.valueOf(count);
    }
}