import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(sumFirstNRnd(n, a, b));
    }

    public static int sumFirstNRnd(int n, int lower, int upper) {
        int seed = lower + upper;
        Random rnd = new Random(seed);
        int intervalLength = upper - lower + 1;
        int res = 0;
        for (int i = 0; i < n; i++) {
            res += rnd.nextInt(intervalLength) + lower;
        }
        return res;
    }
}