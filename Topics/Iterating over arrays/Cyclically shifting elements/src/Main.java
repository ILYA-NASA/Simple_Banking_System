import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lenA = scanner.nextInt();
        int[] a = new int[lenA];
        for (int i = 0; i < lenA; i++) {
            a[i] = scanner.nextInt();
        }
        cycleShiftElem(a);
    }

    public static void cycleShiftElem(int[] arr) {
        System.out.print(arr[arr.length - 1] + " ");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}