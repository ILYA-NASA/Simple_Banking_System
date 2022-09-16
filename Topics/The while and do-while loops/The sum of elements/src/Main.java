import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int stopNum = 0;
        System.out.println(sumNum(stopNum));
    }

    public static int sumNum(int stopLoop) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int value;
        do {
            value = scanner.nextInt();
            sum += value;
        } while (value != stopLoop);
        return sum;
    }
}
