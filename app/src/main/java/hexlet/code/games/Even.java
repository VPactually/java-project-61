package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    static final int MAX_RANDOM = 224;

    public static String[] generateRoundData() {
        int number1;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            number1 = Utils.getRandomNumber(MAX_RANDOM);
            result[i] = Integer.toString(number1);
            result[i + 1] = number1 % 2 == 0 ? "yes" : "no";
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.RND][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.RND; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
}
