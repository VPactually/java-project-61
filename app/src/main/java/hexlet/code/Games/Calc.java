package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final int MAX_RANDOM = 224;
    static final int RND = 3;
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
        String username;
        String operator;
        int number1;
        int number2;
        int answerInt = 0;
        int correctAnswerInt = 0;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        username = Engine.greet();
        System.out.println("What is the result of the expression?");
        while (counter < RND) {
            number1 = random.nextInt(0, MAX_RANDOM);
            number2 = random.nextInt(0, MAX_RANDOM);
            operator = OPERATORS[random.nextInt(OPERATORS.length - 1)];
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            correctAnswerInt = setCorrectAnswer(operator, number1, number2);
            System.out.print("Your answer: ");
            answerInt = scanner.nextInt();
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        System.out.println(Engine.getEndGame(counter, username,
                Integer.toString(answerInt), Integer.toString(correctAnswerInt)));
    }
}
