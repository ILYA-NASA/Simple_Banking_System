import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strNum = String.valueOf(scanner.nextInt());
        System.out.println(strNum.substring(0, 1).equals(strNum.substring(strNum.length() - 1))
                && strNum.substring(1, 2).equals(strNum.substring(2, 3)) ? 1
                : (int) (Math.random() * 100));
    }
}