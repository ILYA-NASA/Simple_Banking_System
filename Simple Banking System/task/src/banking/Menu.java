package banking;

import java.util.Scanner;

public class Menu {
    public static void startsMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Create an account\n" +
                "2. Log into account\n" +
                "0. Exit");
        int costChoose = sc.nextInt();
    }
}
