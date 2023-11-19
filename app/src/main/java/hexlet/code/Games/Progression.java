package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;
    static final int RND = 3;

    public static void gameProgression() {
        String username;
        int[] progression = new int[ARRAY_LENGTH];
        int answerInt = 0;
        int correctAnswerInt = 0;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("What number is missing in the progression?");
        while (counter < RND) {
            int sumProgression = random.nextInt(1, MAX_RANDOM_FOR_SUM_PROGRESSION);
            int randomIndex = random.nextInt(1, progression.length - 1);
            progression[0] = random.nextInt(1, RANDOM_ZERO_ARRAY_ELEMENT);
            System.out.print("Question: ");
            for (int i = 0; i < progression.length - 1; i++) {
                progression[i + 1] = progression[i] + sumProgression;
                System.out.print(i == randomIndex ? ".. " : progression[i] + " ");
                correctAnswerInt = progression[randomIndex];
            }
            System.out.print("\nYour answer: ");
            answerInt = scanner.nextInt();
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        Engine.getEndGame(counter, username, Integer.toString(answerInt), Integer.toString(correctAnswerInt));
    }
}
