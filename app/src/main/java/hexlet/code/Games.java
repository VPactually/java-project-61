package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
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
            return"Invalid input.";
        }
    }


    public static void gameEven() {
        Random random = new Random();
        String answer,correctAnswer, username;
        int numbers, k=3;
        username = greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; ) {
            numbers = random.nextInt(0, 100);
            System.out.println("Question: " + numbers + "\nYour answer: ");
            answer = userAnswers.getString();
            correctAnswer = numbers % 2 == 0 ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                i++; k--;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. " + "Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + username + "!");
                i+=3;
            }
        }
        if (k == 0){
            System.out.println("Congratulations, " + username + "!");
        }
    }
}
