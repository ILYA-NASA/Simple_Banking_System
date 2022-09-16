import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String res = switch (scanner.nextLine()) {
            case "one" -> "1";
            case "two" -> "2";
            case "three" -> "3";
            case "four" -> "4";
            case "five" -> "5";
            case "six" -> "6";
            case "seven" -> "7";
            case "eight" -> "8";
            case "nine" -> "9";
            default -> "error!";
        };
        System.out.println(res);
    }
}