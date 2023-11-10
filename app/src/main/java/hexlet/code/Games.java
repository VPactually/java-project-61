package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    public static String gameEven() {
        Random random = new Random();
        String answer = "";
        String correctAnswer = "";
        String username = "";
        int numbers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        if (scanner.hasNextLine()) {
            username = scanner.nextLine();
            System.out.println("Hello, " + username + "!");
        } else {
            return "Invalid input.";
        }
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; ) {
            numbers = random.nextInt(0, 100);
            System.out.println("Question: " + numbers + "\nYour answer: ");
            answer = hexlet.code.Scanner.getString();
            correctAnswer = numbers % 2 == 0 ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                return "'" + answer + "' is wrong answer ;(. " + "Correct answer was '" + correctAnswer + "'";
            }
        }
        return "Congratulations, " + username + "!";
    }
}
