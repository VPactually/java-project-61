package hexlet.code;

public class App {
    public static void main(String[] args) {
        final int greet = 1;
        final int even = 2;
        final int calc = 3;
        final int gcd = 4;
        final int progression = 5;
        final int prime = 6;
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
            case greet -> Engine.greet();
            case even -> Games.gameEven();
            case calc -> Games.gameCalc();
            case gcd -> Games.gameGcd();
            case progression -> Games.gameProgression();
            case prime -> Games.gamePrime();
            default -> {
            }
        }
    }
}
