import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenArray = sc.nextInt();
        int[] array = new int[lenArray];
        for (int i = 0; i < lenArray; i++) {
            array[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        System.out.println(countNInArray(array, n));
    }

    public static int countNInArray(int[] arr, int elem) {
        int count = 0;
        for (Integer i : arr) {
            if (i == elem) {
                count++;
            }
        }
        return count;
    }
}
