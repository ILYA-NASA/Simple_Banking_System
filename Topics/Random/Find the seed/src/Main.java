import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        searchSeed(a, b, n, k);
    }

    public static void searchSeed(int start, int end, int n, int range) {
        int[] arr = new int[n];
        int min = 0;
        int seed = start;
        for (int i = start; i <= end; i++) {
            Random rnd = new Random(i);
            int max = 0;
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rnd.nextInt(range);
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            if (i == start || min > max) {
                min = max;
                seed = i;
            }
        }
        System.out.println(seed);
        System.out.println(min);
    }
}
