package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    static final int MAX_RANDOM = 224;
    static final int MIN_RANDOM = 2;

    public static int getGcd(int a, int b) {
        int r = a % b;
        return r == 0 ? b : getGcd(b, r);
    }

    public static void gameGcd() {
        int number1;
        int number2;
        Random random = new Random();
        var array = new Object[Engine.getRND()][Engine.getArrayLengthForQuestionAndAnswer()];
        for (int i = 0; i < Engine.getRND(); i++) {
            for (int j = 0; j < Engine.getArrayLengthForQuestionAndAnswer(); j += 2) {
                number1 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
                number2 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
                array[i][j] = number1 + " " + number2;
                array[i][j + 1] = getGcd(number1, number2);
            }
        }
        Engine.logic(array, "Find the greatest common divisor of given numbers.");
    }
}
