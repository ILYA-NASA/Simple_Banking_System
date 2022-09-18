import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = switch (scanner.nextLine()) {
            case "1" -> "You have chosen a square";
            case "2" -> "You have chosen a circle";
            case "3" -> "You have chosen a triangle";
            case "4" -> "You have chosen a rhombus";
            default -> "There is no such shape!";
        };
        System.out.println(output);
    }
}