import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapes = scanner.nextLine();
        final double pi = 3.14;
        switch (shapes) {
            case "triangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double pp = (a + b + c) / 2.0; //полупериметр
                System.out.println(Math.sqrt(pp * (pp - a) * (pp - b) * (pp - c))); //формула Герона
            }
            case "rectangle" -> {
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                System.out.println(a * b);
            }
            default -> { //"circle"
                double r = scanner.nextDouble();
                System.out.println(pi * (r * r));
            }
        }
    }
}