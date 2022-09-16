import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int byFizz = 3;
        final int byBuzz = 5;
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        for (; i <= j; i++) {
            boolean fizz = i % byFizz == 0;
            boolean buzz = i % byBuzz == 0;
            if (fizz && buzz) {
                System.out.println("FizzBuzz");
            } else if (buzz) {
                System.out.println("Buzz");
            } else if (fizz) {
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}