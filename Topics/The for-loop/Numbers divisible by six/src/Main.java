import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final int byTask = 6;
        int sum = 0;
        while (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            if (i % byTask == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}