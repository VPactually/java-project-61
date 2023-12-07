package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    static final int MAX_RANDOM = 224;
    static final String[] OPERATORS = {"+", "-", "*"};

    private static int setCorrectAnswer(String operator, int number1, int number2) {
        return switch (operator) {
            case "+" -> number1 + number2;
            case "-" -> number1 - number2;
            case "*" -> number1 * number2;
            default -> throw new IllegalArgumentException("Unsupported operator: " + operator);
        };
    }

    public static String[] generateRoundData() {
        String[] result = new String[Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        String operator;
        int number1;
        int number2;
        for (int i = 0; i < Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER; i += 2) {
            number1 = Utils.getRandomNumber(0, MAX_RANDOM);
            number2 = Utils.getRandomNumber(0, MAX_RANDOM);
            operator = OPERATORS[Utils.getRandomNumber(OPERATORS.length - 1)];
            result[i] = number1 + " " + operator + " " + number2;
            result[i + 1] = Integer.toString(setCorrectAnswer(operator, number1, number2));
        }
        return result;
    }

    public static void startGame() {
        var array = new String[Engine.RND][Engine.ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER];
        for (int i = 0; i < Engine.RND; i++) {
            array[i] = generateRoundData();
        }
        Engine.logic(array, "What is the result of the expression?");
    }
}
