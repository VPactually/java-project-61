package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Progression {
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;

    public static String[] generateRoundData() {
        int sumProgression;
        int answer = 0;
        int randomIndex = 0;
        int[] progression = new int[ARRAY_LENGTH];
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];

        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            StringBuilder sb = new StringBuilder();
            progression[0] = Utils.getRandomNumber(1, RANDOM_ZERO_ARRAY_ELEMENT);
            sumProgression = Utils.getRandomNumber(1, MAX_RANDOM_FOR_SUM_PROGRESSION);
            for (int j = 0; j < progression.length - 1; j++) {
                randomIndex = Utils.getRandomNumber(1, progression.length - 1);
                progression[j + 1] = progression[j] + sumProgression;
                answer = progression[randomIndex];
            }
            for (int num : progression) {
                if (num == progression[randomIndex]) {
                    sb.append(".. ");
                } else {
                    sb.append(num).append(" ");
                }
            }
            result[i] = sb.toString();
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
