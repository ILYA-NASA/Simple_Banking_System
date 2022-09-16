import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSquirrel = scanner.nextInt();
        int numNuts = scanner.nextInt();
        int result = numNuts / numSquirrel;
        System.out.println(result);
    }
}