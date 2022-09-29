import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int result = crashBridge();
        System.out.println(result != 0 ? "Will crash on bridge " + result : "Will not crash");
    }

    public static int crashBridge() {
        Scanner scanner = new Scanner(System.in);
        int heightBus = scanner.nextInt();
        int countBridge = scanner.nextInt();
        int[] heightBridge = new int[countBridge];
        for (int i = 0; i < heightBridge.length; i++) {
            heightBridge[i] = scanner.nextInt();
        }
        int result = 0;
        for (int i = 0; i < heightBridge.length; i++) {
            if (heightBridge[i] <= heightBus) {
                result = i + 1;
                break;
            }
        }
        return result;
    }
}