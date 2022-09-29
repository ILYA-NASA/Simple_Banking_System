import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int seats = sc.nextInt();
        int[][] cinema = new int[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = sc.nextInt();
            }
        }
        int k = sc.nextInt();
        int count = 0;
        int result = 0;
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema[i].length; j++) {
                if (cinema[i][j] == 0) {
                    count++;
                    if (count == k) {
                        result = i + 1;
                        System.out.println(result);
                        return;
                    }
                } else {
                    count = 0;
                }
            }
            count = 0;
        }
        System.out.println(result);
    }
}