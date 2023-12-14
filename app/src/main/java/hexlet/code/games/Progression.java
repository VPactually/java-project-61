package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;

    public static String[] generateProgression(int size, int step, int firstValue) {
        int[] progression = new int[size];
        String[] result = new String[size];
        progression[0] = firstValue;
        for (int i = 0; i < size - 1; i++) {
            progression[i + 1] = progression[i] + step;
        }
        for (int i = 0; i < size; i++) {
            result[i] = Integer.toString(progression[i]);
        }
        return result;
    }

    public static String[] generateRoundData() {
        int step;
        int firstValue;
        int hiddenNumber = Utils.getRandomNumber(1, ARRAY_LENGTH);
        String answer;
        String[] progression;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        var resultString = new StringBuilder();

        firstValue = Utils.getRandomNumber(1, RANDOM_ZERO_ARRAY_ELEMENT);
        step = Utils.getRandomNumber(1, MAX_RANDOM_FOR_SUM_PROGRESSION);
        progression = generateProgression(ARRAY_LENGTH, step, firstValue);
        answer = progression[hiddenNumber];
        progression[hiddenNumber] = "..";

        for (int i = 0; i < ARRAY_LENGTH; i++) {
            resultString.append(progression[i]).append(" ");
        }

        result[0] = resultString.toString();
        result[1] = answer;
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.ROUNDS_COUNT][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "What number is missing in the progression?");
    }
}
