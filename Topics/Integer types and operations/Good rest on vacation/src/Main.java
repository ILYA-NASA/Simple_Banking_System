import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        int meals = scanner.nextInt();
        int flight = scanner.nextInt();
        int hotel = scanner.nextInt();
        int cost = days * (meals + hotel) - hotel + flight * 2;
        System.out.println(cost);
    }
}