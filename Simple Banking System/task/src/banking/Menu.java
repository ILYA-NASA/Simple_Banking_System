package banking;

import banking.account.CreateAccount;

import java.util.Scanner;

public class Menu {
    public static String startsMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
        String cardInfo = new String();
        int costChoose = sc.nextInt();
        if (costChoose == 1) {
            cardInfo = CreateAccount.generateCardNum() + "\n" + CreateAccount.generatePinCode();
        } else if (costChoose == 2) {
            //TODO
        }
        return cardInfo;
    }
}
