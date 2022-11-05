import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        countAreaOfParallelogram(sc.nextInt(), sc.nextInt());
    }

    public static void countAreaOfParallelogram(int b, int h) {
        System.out.println(b * h);
    }
}