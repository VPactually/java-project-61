package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    static final int MAX_RANDOM = 224;
    static final int START_INDEX = 3;

    public static boolean isPrime(double n) {
        if (n <= 1 || n % 2 == 0) {
            return n == 2;
        }
        for (int i = START_INDEX; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateRoundData() {
        int number;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        number = Utils.getRandomNumber(2, MAX_RANDOM);
        result[0] = Integer.toString(number);
        result[1] = isPrime(number) ? "yes" : "no";
        return result;
    }

    public static void startGamePrime() {
        var array = new String[Engine.ROUNDS_COUNT][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
