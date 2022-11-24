import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] profit = new float[n];
        float[] percent = new float[n];
        float[] result = new float[n];

        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            percent[i] = sc.nextInt();
        }

        float max = 0;
        int numMax = 0;
        for (int i = 0; i < n; i++) {
            if (percent[i] != 0) {
                result[i] = profit[i] / 100 * percent[i];
            } else {
                result[i] = 0;
            }
            if (result[i] > max) {
                max = result[i];
                numMax = i;
            }
        }
        System.out.println(++numMax);
    }
}