package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER = 2;
    public static final String WIN_MSG_PATTERN = "Congratulations, %s!";
    public static final String LOSE_MSG_PATTERN = "'%s' is wrong answer ;(. Correct answer was '%s'."
            + "\nLet's try again, %s!";

    public static void logic(String[][] array, String rule) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        int counter = 0;

        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = scanner.nextLine();
        System.out.println("Hello, " + username + "!\n");

        System.out.println(rule);
        for (var round : array) {
            System.out.print("Question: " + round[0] + "\nYour answer: ");
            answer = scanner.nextLine();
            if (!answer.equals(round[1])) {
                System.out.printf(LOSE_MSG_PATTERN, answer, array[counter][1], username);
                return;
            }
            System.out.println("Correct!");
            counter++;
        }
        System.out.printf(WIN_MSG_PATTERN, username);
    }
}
