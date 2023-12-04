package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    static final int MAX_RANDOM = 224;

    public static void gameEven() {
        Random random = new Random();
        var array = new Object[Engine.getRND()][Engine.getArrayLengthForQuestionAndAnswer()];
        for (int i = 0; i < Engine.getRND(); i++) {
            for (int j = 0; j < Engine.getArrayLengthForQuestionAndAnswer(); j += 2) {
                array[i][j] = random.nextInt(0, MAX_RANDOM);
                array[i][j + 1] = (int) array[i][j] % 2 == 0 ? "yes" : "no";
            }
        }
    }
}
