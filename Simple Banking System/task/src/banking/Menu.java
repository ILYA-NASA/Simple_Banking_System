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
            startsMenu();
        } else if (costChoose == 2) {
            System.out.println("Enter your card number:");
            if (sc.next().equals(cardInfo[0]) && sc.next().equals(cardInfo[1])) {
                System.out.println("You have successfully logged in!");
                //TODO
            } else {
                System.out.println("Wrong card number or PIN!");
                //TODO
            }
        }
        return cardInfo;
    }
}
