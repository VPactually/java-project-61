package hexlet.code;

public class App {
    public static void main(String[] args) {
        Engine choice = new Engine();
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");

        switch (choice.getChoice()) {
            case 1 -> Games.greet();
            case 2 -> Games.gameEven();
            default -> {
            }
        }
    }
}
