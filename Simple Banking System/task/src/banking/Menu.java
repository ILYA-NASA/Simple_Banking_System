package banking;

import banking.account.CreateAccount;
import banking.account.UsedAccount;

import java.util.Scanner;

public class Menu {
    public static String[] startsMenu(String card, String pin) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
        int costChoose = sc.nextInt();
        if (costChoose == 1) {
            String cardNum = CreateAccount.generateCardNum();
            String pinCode = CreateAccount.generatePinCode();
            System.out.println("\nYour card has been created\nYour card number:\n"
                    + cardNum
                    + "\nYour card PIN:\n" + pinCode);
            startsMenu(cardNum, pinCode);
        } else if (costChoose == 2) {
            System.out.println("\nEnter your card number:");
            String cardNum = sc.next();
            System.out.println("Enter your PIN:");
            String pinCode = sc.next();
            if (cardNum.equals(card) && pinCode.contentEquals(pin)) {
                System.out.println("\nYou have successfully logged in!");
                UsedAccount.accountMenu(cardNum, pinCode);
            } else {
                System.out.println("\nWrong card number or PIN!");
                startsMenu(card, pin);
            }
        }
        return new String[]{card, pin};
    }
}
