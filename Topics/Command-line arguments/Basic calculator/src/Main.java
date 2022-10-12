
class Problem {
    public static void main(String[] args) {
        String ch = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        switch (ch) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            default -> System.out.println("Unknown operator");
        }
    }
}