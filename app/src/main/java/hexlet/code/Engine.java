package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int RND = 3;
    public static final int ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER = 2;

    public static String getIfLose(Object answer, Object correctAnswer, String username) {
        return "'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                + correctAnswer + "'." + "\nLet's try again, " + username + "!";
    }

    public static String getIfWin(String username) {
        return "Congratulations, " + username + "!";
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

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
                break;
            }
            System.out.println("Correct!");
            counter++;
        }
        System.out.println(counter == RND
                ? getIfWin(username)
                : getIfLose(answer, array[counter][1], username));
    }
}
