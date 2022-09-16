import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        if (num > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}