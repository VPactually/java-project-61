package hexlet.code;

import java.util.Random;

public class Games {
    public static boolean gameEven() {
        Random random = new Random();
        String answer = "";
        String correctAnswer = "";
        int numbers = 0;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3;) {
            numbers = random.nextInt(0, 100);
            System.out.println("Question: " + numbers + "\nYour answer: ");
            answer = Scanner.getString();
            correctAnswer = numbers % 2 == 0 ? "yes" : "no";
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
                i++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'");
                return false;
            }
        }
        return true;
    }
}
