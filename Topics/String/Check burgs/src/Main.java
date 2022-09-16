import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        String endsFromTask = "burg";
        System.out.println(checkEndsCityName(cityName, endsFromTask));
    }

    public static boolean checkEndsCityName(String allStr, String endsStr) {
        return allStr.endsWith(endsStr);
    }
}