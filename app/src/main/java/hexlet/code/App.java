package hexlet.code;

public class App {
    public static void main(String[] args) {
        int choice = 0;
        String username;
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        switch (Scanner.getInt()) {
            case 1 -> Cli.greeting();
            case 2 -> {
                username = Cli.greeting();
                System.out.println(Games.gameEven(username));
            }
            default -> {
            }
        }
    }
}
