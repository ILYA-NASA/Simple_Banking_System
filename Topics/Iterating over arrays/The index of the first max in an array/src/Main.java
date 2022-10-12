import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lenArr = sc.nextInt();
        int[] arr = new int[lenArr];
        int firstMax = 0;
        int indexFirstMax = 0;
        for (int i = 0; i < lenArr; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > firstMax && arr[i] != firstMax) {
                firstMax = arr[i];
                indexFirstMax = i;
            }
        }
        System.out.println(indexFirstMax);
    }
}