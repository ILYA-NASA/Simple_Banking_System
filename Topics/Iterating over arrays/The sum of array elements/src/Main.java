import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(sumElementArray(createArray()));
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int sumElementArray(int[] arr) {
        int sum = 0;
        for (Integer i: arr) {
            sum += i;
        }
        return sum;
    }
}