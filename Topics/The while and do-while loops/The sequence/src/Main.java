import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        final int den = 4;
        int res = 0;
        while (scanner.hasNextInt()) {
            int elem = scanner.nextInt();
            if (elem % den == 0 && elem > res) {
                res = elem;
            }
        }
        System.out.println(res);
    }
}