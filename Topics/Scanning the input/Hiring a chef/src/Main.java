import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.print("The form for ");
        System.out.print(word1);
        System.out.print(" is completed. We will contact you if we need a chef who cooks ");
        System.out.print(word3);
        System.out.print(" dishes and has ");
        System.out.print(word2);
        System.out.print(" years of experience.");
    }
}
