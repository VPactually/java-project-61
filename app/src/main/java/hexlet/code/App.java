package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");

        switch (userAnswers.getInt()) {
            case 1 -> Games.greet();
            case 2 -> Games.gameEven();
            default -> {
            }
        }
    }
}
