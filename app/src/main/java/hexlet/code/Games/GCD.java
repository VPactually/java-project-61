package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    static final int MAX_RANDOM = 224;
    static final int MIN_RANDOM = 2;
    static final int RND = 3;

    public static void gameGcd() {
        String username;
        int number1;
        int number2;
        int answerInt = 0;
        int correctAnswerInt = 0;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (counter < RND) {
            number1 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
            number2 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
            System.out.println("Question: " + number1 + " " + number2 + "\nYour answer: ");
            answerInt = scanner.nextInt();
            correctAnswerInt = Engine.getGcd(Math.max(number1, number2), Math.min(number1, number2));
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(Integer.toString(answerInt), Integer.toString(correctAnswerInt), username));
    }
}
