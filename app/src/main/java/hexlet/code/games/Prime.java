package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

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

    public static String[] generateRoundData() {
        int number;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            number = Utils.getRandomNumber(2, MAX_RANDOM);
            result[i] = Integer.toString(number);
            result[i + 1] = isPrime(number) ? "yes" : "no";
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.RND][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.RND; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
}
