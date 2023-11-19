package hexlet.code.Games;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;

public class Prime {
    static final int MAX_RANDOM = 224;
    static final int RND = 3;
    public static void gamePrime() {
        String username;
        int number;
        String answer = null;
        String correctAnswer = null;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (counter < RND) {
            number = random.nextInt(2, MAX_RANDOM);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = Engine.isPrime(number);
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answer, correctAnswer, username));
    }
}
