package hexlet.code.Games;

import java.util.Random;

import hexlet.code.Engine;

public class Prime {
    static final int MAX_RANDOM = 224;

    public static boolean isPrime(double n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void gamePrime() {
        Random random = new Random();
        int number;
        var array = new Object[Engine.getRND()][Engine.getArrayLengthForQuestionAndAnswer()];
        for (int i = 0; i < Engine.getRND(); i++) {
            for (int j = 0; j < Engine.getArrayLengthForQuestionAndAnswer(); j += 2) {
                number = random.nextInt(2, MAX_RANDOM);
                array[i][j] = number;
                array[i][j + 1] = isPrime(number) ? "yes" : "no";
            }
        }
        Engine.logic(array, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
