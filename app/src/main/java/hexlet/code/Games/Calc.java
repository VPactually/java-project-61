package hexlet.code.Games;

import hexlet.code.Engine;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    static final int MAX_RANDOM = 224;
    static final int RND = 3;
    public static void gameCalc() {
        String username;
        String[] operators = {"+", "-", "*"};
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

            operator = operators[random.nextInt(operators.length - 1)];
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
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
            System.out.print("Your answer: ");
            answerInt = scanner.nextInt();
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answerInt, correctAnswerInt, username));
    }
}
