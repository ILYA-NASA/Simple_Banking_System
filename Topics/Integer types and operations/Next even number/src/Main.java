import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int integerNumber = scanner.nextInt();
        int result = integerNumber % 2 == 0 ? integerNumber + 2 : integerNumber + 1;
        System.out.println(result);
    }
}