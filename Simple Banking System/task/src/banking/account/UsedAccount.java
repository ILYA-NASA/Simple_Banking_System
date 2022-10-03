package banking.account;

import banking.Menu;

import java.util.Scanner;

public class UsedAccount {
    public static void accountMenu(String cardNum, String pinCode) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Balance\n" +
                "2. Log out\n" +
                "0. Exit");
        int choose = sc.nextInt();
        if (choose == 1) {
            balance();
            accountMenu(cardNum, pinCode);
        } else if (choose == 2) {
            System.out.println("\nYou have successfully logged out!");
            Menu.startsMenu(cardNum, pinCode);
        } else {
            System.out.println("\nBye!");
        }
    }

    public static void balance() {
        System.out.println("\nBalance: " + 0);
    }

}
