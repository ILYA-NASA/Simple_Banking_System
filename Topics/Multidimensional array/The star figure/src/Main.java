class Main {
    public static void main(String[] args) {
        final int length = 15;
        String[][] arr = new String[length][length];
        int k = 0;
        int d = length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = ".";
                if (j == arr.length / 2) {
                    arr[i][j] = "*";
                }
                if (i == arr.length / 2) {
                    arr[i][k] = "*";
                    k++;
                }
                if (i == j) {
                    arr[i][j] = "*";
                }
            }
            arr[i][d] = "*";
            d--;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}