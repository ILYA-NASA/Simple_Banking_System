import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int room1 = scanner.nextInt();
        int room2 = scanner.nextInt();
        int room3 = scanner.nextInt();
        final int couple = 2;
        System.out.println(++room1 / couple
                + ++room2 / couple
                + ++room3 / couple);
    }
}