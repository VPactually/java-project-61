package hexlet.code;

public class App {
    public static void main(String[] args) {
        int choice = 0;
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit
                Your choice:\s""");
        switch (Scanner.getInt()) {
            case 2 -> {
                System.out.println(Games.gameEven());
            }
            default -> {
            }
        }
    }
}
