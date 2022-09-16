import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrLen = sc.nextInt();
        int[] arr = new int[arrLen];
        for (int i = 0; i < arrLen; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(searchMinValArr(arr));
    }

    public static int searchMinValArr(int[] args) {
        int min = args[0];
        for (Integer i : args) {
            min = min <= i ? min : i;
        }
        return min;
    }
}