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
            return "Invalid input.";
        }
    }


    public static void gameEven() {
        Random random = new Random();
        Engine engine = new Engine();
        Scanner scanner = new Scanner(System.in);
        int number, counter = 0;
        engine.setUsername(greet());
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counter < 3) {
            number = random.nextInt(0, 100);
            System.out.println("Question: " + number + "\nYour answer: ");
            engine.setAnswer(scanner.nextLine());
            engine.setCorrectAnswer(number % 2 == 0 ? "yes" : "no");
            counter += engine.isCorrect() ? 1 : 4;

        }
        System.out.println(counter > 3 ? engine.getIfLose() : engine.getIfWin());
    }
}
