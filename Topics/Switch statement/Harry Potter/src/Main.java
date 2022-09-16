import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String magicExplanatoryHat = switch (scanner.nextLine()) {
            case "gryffindor" -> "bravery";
            case "hufflepuff" -> "loyalty";
            case "slytherin" -> "cunning";
            case "ravenclaw" -> "intellect";
            default -> "not a valid house";
        };
        System.out.println(magicExplanatoryHat);
    }
}