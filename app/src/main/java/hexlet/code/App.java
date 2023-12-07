package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


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
            case greet -> Cli.greeting();
            case even -> Even.startGame();
            case calc -> Calc.startGame();
            case gcd -> GCD.startGame();
            case progression -> Progression.startGame();
            case prime -> Prime.startGame();
            default -> System.out.println("Good bye!");
        }
    }
}
