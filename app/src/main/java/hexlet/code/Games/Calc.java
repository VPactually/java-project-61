package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

public class Calc {
    static final int MAX_RANDOM = 224;
    static final String[] OPERATORS = {"+", "-", "*"};

    private static int setCorrectAnswer(String operator, int number1, int number2) {
        int correctAnswerInt = 0;
        switch (operator) {
            case "+":
                correctAnswerInt = number1 + number2;
                break;
            case "-":
                correctAnswerInt = number1 - number2;
                break;
            case "*":
                correctAnswerInt = number1 * number2;
                break;
            default:
                System.out.println("Wrong choice.");
        }
        return correctAnswerInt;
    }

    public static void gameCalc() {
        String operator;
        int number1;
        int number2;
        Random random = new Random();
        var array = new Object[Engine.getRND()][Engine.getArrayLengthForQuestionAndAnswer()];
        for (int i = 0; i < Engine.getRND(); i++) {
            for (int j = 0; j < Engine.getArrayLengthForQuestionAndAnswer(); j += 2) {
                number1 = random.nextInt(0, MAX_RANDOM);
                number2 = random.nextInt(0, MAX_RANDOM);
                operator = OPERATORS[random.nextInt(OPERATORS.length - 1)];
                array[i][j] = number1 + " " + operator + " " + number2;
                array[i][j + 1] = setCorrectAnswer(operator, number1, number2);
            }
        }
    }
}
