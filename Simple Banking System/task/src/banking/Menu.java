package banking;

import banking.account.CreateAccount;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {
    public static String[] startsMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
        final int cardInfoLength = 2;
        String[] cardInfo = new String[cardInfoLength];
        int costChoose = sc.nextInt();
        if (costChoose == 1) {
            String cardNum = CreateAccount.generateCardNum();
            String pinCode = CreateAccount.generatePinCode();
            System.out.println("Your card has been created\nYour card number:\n"
                              + cardNum
                              + "\nYour card PIN:\n" + pinCode);
            cardInfo[0] = cardNum;
            cardInfo[1] = pinCode;
        } else if (costChoose == 2) {
            //TODO
        }
        return cardInfo;
    }
}
