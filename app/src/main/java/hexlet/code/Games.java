package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {
    static final int MAX_RANDOM = 224;
    static final int MIN_RANDOM = 2;
    static final int ARRAY_LENGTH = 10;
    static final int MAX_RANDOM_FOR_SUM_PROGRESSION = 12;
    static final int RANDOM_ZERO_ARRAY_ELEMENT = 10;
    static final int RND = 3;



    public static void gameEven() {
        String username;
        int number;
        String answer = null;
        String correctAnswer = null;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        username = Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (counter < RND) {
            number = random.nextInt(0, MAX_RANDOM);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(counter > RND
                ? Engine.getIfLose(answer, correctAnswer, username)
                : Engine.getIfWin(username));
    }

    public static void gameCalc() {
        String username;
        String[] operators = {"+", "-", "*"};
        String operator;
        int number1;
        int number2;
        int answerInt = 0;
        int correctAnswerInt = 0;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("What is the result of the expression?");
        while (counter < RND) {
            number1 = random.nextInt(0, MAX_RANDOM);
            number2 = random.nextInt(0, MAX_RANDOM);

            operator = operators[random.nextInt(operators.length - 1)];
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            switch (operator) {
                case "+":
                    correctAnswerInt = number1 + number2;
                    break;
                case "-":
                    correctAnswerInt = number1 - number2;
                    break;
                case "*":
                    correctAnswerInt = number1 * number2;
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
            System.out.print("Your answer: ");
            answerInt = scanner.nextInt();
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answerInt, correctAnswerInt, username));
    }

    public static void gameGcd() {
        String username;
        int number1;
        int number2;
        int answerInt = 0;
        int correctAnswerInt = 0;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (counter < RND) {
            number1 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
            number2 = random.nextInt(MIN_RANDOM, MAX_RANDOM);
            System.out.println("Question: " + number1 + " " + number2 + "\nYour answer: ");
            answerInt = scanner.nextInt();
            correctAnswerInt = Engine.getGcd(Math.max(number1, number2), Math.min(number1, number2));
            counter += Engine.result(Engine.isCorrectAnswer(answerInt, correctAnswerInt));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answerInt, correctAnswerInt, username));
    }

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
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answerInt, correctAnswerInt, username));
    }

    public static void gamePrime() {
        String username;
        int number;
        String answer = null;
        String correctAnswer = null;
        int counter = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        username = Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (counter < RND) {
            number = random.nextInt(2, MAX_RANDOM);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = Engine.isPrime(number);
            counter += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(counter == RND
                ? Engine.getIfWin(username)
                : Engine.getIfLose(answer, correctAnswer, username));
    }
}
