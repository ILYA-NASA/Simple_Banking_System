import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        return "aAeEiIoOuU".contains(Character.toString(ch));
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}