package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        switch (scanner.nextLine()) {
            case "1" -> Cli.greeting();
            case "2" -> Even.startGameEven();
            case "3" -> Calc.startGameCalc();
            case "4" -> GCD.startGameGCD();
            case "5" -> Progression.startGameProgression();
            case "6" -> Prime.startGamePrime();
            default -> System.out.println("Good bye!");
        }
    }
}
