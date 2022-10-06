import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printArray(createStar(sc.nextInt()));
    }

    public static String[][] createStar(int size) {
        String[][] arr = new String[size][size];
        int k = 0;
        int d = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ".";
                if (j == arr.length / 2 || i == j) {
                    arr[i][j] = "*";
                }
                if (i == arr.length / 2) {
                    arr[i][k] = "*";
                    k++;
                }
            }
            arr[i][d] = "*";
            d--;
        }
        return arr;
    }

    public static void printArray(String[][] arr) {
        for (String[] str : arr) {
            for (String s : str) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}