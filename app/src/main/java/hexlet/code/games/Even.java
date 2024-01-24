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
        number = Utils.getRandomNumber(MAX_RANDOM);
        result[0] = Integer.toString(number);
        result[1] = isEven(number) ? "yes" : "no";
        return result;
    }

    public static void startGameEven() {
        var array = new String[Engine.ROUNDS_COUNT][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
