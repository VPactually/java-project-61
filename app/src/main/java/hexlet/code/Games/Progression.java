package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;

    public static void gameProgression() {

        Random random = new Random();
        var array = new Object[Engine.getRND()][Engine.getArrayLengthForQuestionAndAnswer()];
        Object[] progression = new Object[ARRAY_LENGTH];
        int randomIndex = random.nextInt(1, progression.length - 1);
        int sumProgression = random.nextInt(1, MAX_RANDOM_FOR_SUM_PROGRESSION);
        int answer;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Engine.getRND(); i++) {
            for (int j = 0; j < Engine.getArrayLengthForQuestionAndAnswer(); j += 2) {
                progression[0] = random.nextInt(1, RANDOM_ZERO_ARRAY_ELEMENT);

                for (int k = 0; k < progression.length - 1; k++) {
                    progression[k + 1] = (int) progression[k] + sumProgression;
                }
                answer = (int) progression[randomIndex];
                progression[randomIndex] = "..";

                for (Object o : progression) {
                    sb.append(o).append(" ");
                }

                array[i][j] = sb;
                array[i][j + 1] = answer;
            }
        }
    }
}
