import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(numTriples(createArray()));
    }

    public static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        int lenArray = sc.nextInt();
        int[] array = new int[lenArray];
        for (int i = 0; i < lenArray; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int numTriples(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1] - 1
                    && arr[i + 1] == arr[i + 2] - 1) {
                count++;
            }
        }
        return count;
    }
}

