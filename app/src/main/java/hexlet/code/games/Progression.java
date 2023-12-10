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
        int randomIndex = Utils.getRandomNumber(1, ARRAY_LENGTH - 1);
        for (int i = 0; i < size; i++) {
            if (i == randomIndex) {
                result[i] = "..";
            } else {
                result[i] = String.valueOf(progression[i]);
            }
        }
        return result;
    }

    public static int getAnswerInProgression(String[] progression) {
        int result = 0;
        for (int i = 0; i < progression.length; i++) {
            if (progression[i].equals("..")) {
                return (Integer.parseInt(progression[i + 1]) + Integer.parseInt(progression[i - 1])) / 2;
            }
        }
        return result;
    }

    public static String[] generateRoundData() {
        int step;
        int firstValue;
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {

            firstValue = Utils.getRandomNumber(1, RANDOM_ZERO_ARRAY_ELEMENT);
            step = Utils.getRandomNumber(1, MAX_RANDOM_FOR_SUM_PROGRESSION);

            var progression = generateProgression(ARRAY_LENGTH, step, firstValue);
            var answer = getAnswerInProgression(progression);
            var resultString = new StringBuilder();

            for (int j = 0; j < ARRAY_LENGTH; j++) {
                resultString.append(progression[j]).append(" ");
            }

            result[i] = resultString.toString();
            result[i + 1] = Integer.toString(answer);
        }
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
