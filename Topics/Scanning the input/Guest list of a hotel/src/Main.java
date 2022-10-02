import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> namesGuests = new ArrayList<>();
        while (scanner.hasNext()) {
            namesGuests.add(scanner.next());
        }
        Collections.reverse(namesGuests);
        namesGuests.forEach(System.out::println);
    }
}