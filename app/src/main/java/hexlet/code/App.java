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
        System.out.println("\n");
        switch (Scanner.getInt()) {
            case 1 -> {
                username = Cli.greeting();
            }
            case 2 -> {
                username = Cli.greeting();
                if (Games.gameEven()) {
                    System.out.println("Congratulation, " + username + "!");
                } else {
                    System.out.println("Let's try again, " + username + "!");
                }
            }
            default -> System.out.println();
        }
    }
}
