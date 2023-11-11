package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public static void gameEven() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = null, correctAnswer = null;
        int number, counter = 0;
        String username = Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counter < 3) {
            number = random.nextInt(0, 100);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(counter > 3 ? Engine.getIfLose(answer, correctAnswer, username) : Engine.getIfWin(username));
    }

    public static void gameCalc() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1, number2, counter = 0, answer = 0, correctAnswer = 0;
        String[] operators = {"+", "-", "*"};
        String operator;
        String username = Engine.greet();
        System.out.println("What is the result of the expression?");
        while (counter < 3) {
            number1 = random.nextInt(0, 100);
            number2 = random.nextInt(0, 100);
            operator = operators[random.nextInt(2)];
            System.out.print("Question: ");
            switch (operator) {
                case "+" -> {
                    System.out.print(number1 + "+" + number2 + "\nYour answer: ");
                    correctAnswer = number1 + number2;
                }
                case "-" -> {
                    System.out.print(number1 + "-" + number2 + "\nYour answer: ");
                    correctAnswer = number1 - number2;
                }
                case "*" -> {
                    System.out.print(number1 + "*" + number2 + "\nYour answer: ");
                    correctAnswer = number1 * number2;
                }
            }
            answer = scanner.nextInt();
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
            System.out.println("Counter = " + counter);
        }
        System.out.println(counter == 3 ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }
}
