package hexlet.code;

import hexlet.code.Games.Even;
import hexlet.code.Games.Calc;
import hexlet.code.Games.GCD;
import hexlet.code.Games.Progression;
import hexlet.code.Games.Prime;

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

        switch (4) {
            case greet -> Engine.greet();
            case even -> Even.gameEven();
            case calc -> Calc.gameCalc();
            case gcd -> GCD.gameGcd();
            case progression -> Progression.gameProgression();
            case prime -> Prime.gamePrime();
            default -> {
            }
        }
    }
}
