import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = 0;
        for (long i = 0; getFactorial(i) <= m; i++) {
            n = i;
        }
        System.out.println(++n);
    }

    public static long getFactorial(long f) {
        if (f <= 1) {
            return 1;
        } else {
            return f * getFactorial(f - 1);
        }
    }
}