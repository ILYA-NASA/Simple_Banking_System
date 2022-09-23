import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int taskMultiplier = 10;
        while (sc.hasNextLine()) {
            String userInput = sc.nextLine();
            try {
                int result = Integer.parseInt(userInput);
                if (result != 0) {
                    System.out.println(result * taskMultiplier);
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid user input: " + userInput);
            }
        }
    }
}