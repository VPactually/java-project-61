package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    static final int MAX_RANDOM = 224;
    static final int MIN_RANDOM = 2;

    public static int getGcd(int a, int b) {
        int r = a % b;
        return r == 0 ? b : getGcd(b, r);
    }

    public static String[] generateRoundData() {
        int number1;
        int number2;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            number1 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            number2 = Utils.getRandomNumber(MIN_RANDOM, MAX_RANDOM);
            result[i] = number1 + " " + number2;
            result[i + 1] = Integer.toString(getGcd(number1, number2));
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.RND][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.RND; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Find the greatest common divisor of given numbers.");
    }
}
