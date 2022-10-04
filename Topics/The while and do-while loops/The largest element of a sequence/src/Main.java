import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            if (n != 0) {
                res = n > res ? n : res;
            }
        }
        System.out.println(res);
    }
}