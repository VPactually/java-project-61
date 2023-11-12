package hexlet.code;

public class App {
    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");


        switch (Engine.getChoice()) {
            case 1 -> Engine.greet();
            case 2 -> Games.gameEven();
            case 3 -> Games.gameCalc();
            case 4 -> Games.gameGcd();
            case 5 -> Games.gameProgression();
            case 6 -> Games.gamePrime();
            default -> {
            }
        }
    }
}
