package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int MAX_RANDOM = 224;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[] generateRoundData() {
        int number;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            number = Utils.getRandomNumber(MAX_RANDOM);
            result[i] = Integer.toString(number);
            result[i + 1] = isEven(number) ? "yes" : "no";
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.ROUNDS_COUNT][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
