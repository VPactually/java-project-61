package hexlet.code;

import java.util.Scanner;

public class Engine {
    static final int RND = 3;
    static final int ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER = 2;

    public static int getArrayLengthForQuestionAndAnswer() {
        return ARRAY_LENGTH_FOR_QUESTION_AND_ANSWER;
    }

    public static int getRND() {
        return RND;
    }

    public static String greet() {
        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        if (scanner.hasNextLine()) {
            username = scanner.nextLine();
            System.out.println("Hello, " + username + "!\n");
            return username;
        } else {
            return "Invalid input.";
        }
    }

    public static boolean isCorrectAnswer(String answer, String correctAnswer) {
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public static boolean isCorrectAnswer(int answer, int correctAnswer) {
        return answer == correctAnswer;
    }

    public static String getEndGame(int counter, String username, String answer, String correctAnswer) {
        return counter < RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answer, correctAnswer, username);
    }

    public static String getIfLose(String answer, String correctAnswer, String username) {
        return "'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                + correctAnswer + "'." + "\nLet's try again, " + username + "!";
    }

    public static String getIfWin(String username) {
        return "Congratulations, " + username + "!";
    }

    public static int result(boolean result) {
        if (result) {
            System.out.println("Correct!");
            return 1;
        } else {
            return RND;
        }
    }

    public static int getChoice() {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

    public static void logic(Object[][] array, String rule) {
        String username = greet();

    }


}
