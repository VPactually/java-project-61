package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;

    public static String[] generateRoundData() {
        int sumProgression;
        int answer;
        String[] progression = new String[ARRAY_LENGTH];
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        int randomIndex = Utils.getRandomNumber(1, progression.length - 1);
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            StringBuilder sb = new StringBuilder();

            sumProgression = Utils.getRandomNumber(1, MAX_RANDOM_FOR_SUM_PROGRESSION);
            progression[0] = String.valueOf(Utils.getRandomNumber(1, RANDOM_ZERO_ARRAY_ELEMENT));

            for (int k = 0; k < progression.length - 1; k++) {
                progression[k + 1] = progression[k] + sumProgression;
            }
            answer = Integer.parseInt(progression[randomIndex]);
            progression[randomIndex] = "..";

            for (Object o : progression) {
                sb.append(o).append(" ");
            }

            result[i] = String.valueOf(sb);
            result[i + 1] = Integer.toString(answer);
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.RND][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.RND; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "What number is missing in the progression?");
    }
}
