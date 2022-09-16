import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * Switch expression
         */
        String res = switch (scanner.nextLine()) {
            case "0" -> "do not move";
            case "1" -> "move up";
            case "2" -> "move down";
            case "3" -> "move left";
            case "4" -> "move right";
            default -> "error!";
        };
        System.out.println(res);
    }
}