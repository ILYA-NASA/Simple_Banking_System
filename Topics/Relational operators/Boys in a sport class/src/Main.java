import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(gcd(3,7));
    }

    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }
}