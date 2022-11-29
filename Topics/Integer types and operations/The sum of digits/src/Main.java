import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int threeDigit = scanner.nextInt();
        System.out.println
                (threeDigit / 100
                + (threeDigit - threeDigit / 100 * 100) / 10
                + (threeDigit - threeDigit / 10 * 10));
    }
}