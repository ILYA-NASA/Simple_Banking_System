import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weekend = scanner.nextInt();
        boolean weekDay = scanner.nextBoolean();
        partyQuality(weekend, weekDay);
    }

    public static void partyQuality(int peanut, boolean day) {
        final int minWeekend = 15;
        final int maxWeekend = 25;
        final int minWeekday = 10;
        final int maxWeekday = 20;
        boolean normWeekend = peanut >= minWeekend && peanut <= maxWeekend;
        boolean normWeekday = peanut >= minWeekday && peanut <= maxWeekday;
        if (day) {
            System.out.println(normWeekend);
        } else {
            System.out.println(normWeekday);
        }
    }
}