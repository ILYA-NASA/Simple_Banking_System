import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userStr = scanner.next();
        String startsFromTask = "J";
        System.out.println(checkStartsIgnoreCase(userStr, startsFromTask));
    }

    public static boolean checkStartsIgnoreCase(String str, String starts) {
        return str.startsWith(starts.toLowerCase()) || str.startsWith(starts.toUpperCase());
    }
}