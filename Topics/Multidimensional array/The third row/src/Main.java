
class ArrayOperations {
    public static void printTheThirdRow(int[][] twoDimArray) {
        // write your code here
        final int indexTaskNumString = 2;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (i == indexTaskNumString) {
                    System.out.print(twoDimArray[i][j] + " ");
                }
            }
        }
    }
}
