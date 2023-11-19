package hexlet.code;

import java.util.Scanner;

public class Engine {

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

    public static String getIfLose(String answer, String correctAnswer, String username) {
        return "'" + answer + "' is wrong answer ;(. " + "Correct answer was '"
                + correctAnswer + "'." + "\nLet's try again, " + username + "!";
    }

    public static String getIfWin(String username) {
        return "Congratulations, " + username + "!";
    }

    public static int result(boolean result) {
        final int endGame = 5;
        if (result) {
            System.out.println("Correct!");
            return 1;
        } else {
            return endGame;
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

    public static int getGcd(int a, int b) {
        int r = a % b;
        return r == 0 ? b : getGcd(b, r);
    }

    public static String isPrime(double n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "no";
            }
        }
        return "yes";
    }

}
