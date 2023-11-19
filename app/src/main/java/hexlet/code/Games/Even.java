package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {

    static final int MAX_RANDOM = 224;
    static final int RND = 3;

    public static void gameEven() {
        String username;
        int number;
        String answer = null;
        String correctAnswer = null;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        username = Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counter < RND) {
            number = random.nextInt(0, MAX_RANDOM);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(Engine.getEndGame(counter, username, answer, correctAnswer));
    }
}
