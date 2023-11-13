package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public static void gameEven() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        String correctAnswer = null;
        int number;
        int rnd = 3;
        int cntr = 0;
        final int maxRandom = 100;
        String username = Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (cntr < rnd) {
            number = random.nextInt(0, maxRandom);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            cntr += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cntr > rnd ? Engine.getIfLose(answer, correctAnswer, username) : Engine.getIfWin(username));
    }

    public static void gameCalc() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int rnd = 3;
        int cntr = 0;
        final int maxRandom = 100;
        int answer = 0;
        int correctAnswer = 0;
        String[] operators = {"+", "-", "*"};
        String operator;
        String username = Engine.greet();
        System.out.println("What is the result of the expression?");
        while (cntr < rnd) {
            number1 = random.nextInt(0, maxRandom);
            number2 = random.nextInt(0, maxRandom);
            operator = operators[random.nextInt(operators.length - 1)];
            System.out.println("Question: " + number1 + " " + operator + " " + number2);
            switch (operator) {
                case "+":
                    correctAnswer = number1 + number2;
                    break;
                case "-":
                    correctAnswer = number1 - number2;
                    break;
                case "*":
                    correctAnswer = number1 * number2;
                    break;
                default:
                    System.out.println("Wrong choice.");
            }
            System.out.print("Your answer: ");
            answer = scanner.nextInt();
            cntr += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cntr == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gameGcd() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int rnd = 3;
        int cntr = 0;
        final int maxRandom = 101;
        int answer = 0;
        int correctAnswer = 0;
        String username = Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (cntr < rnd) {
            number1 = random.nextInt(0, maxRandom);
            number2 = random.nextInt(0, maxRandom);
            System.out.println("Question: " + number1 + " " + number2 + "\nYour answer: ");
            answer = scanner.nextInt();
            correctAnswer = Engine.getGcd(Math.max(number1, number2), Math.min(number1, number2));
            cntr += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cntr == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gameProgression() {
        Random random = new Random();
        int[] progression = new int[10];
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int correctAnswer = 0;
        String username;
        int rnd = 3;
        int cntr = 0;
        final int maxRandomForSumProgression = 12;
        final int randomZeroArrayElement = 10;
        username = Engine.greet();
        System.out.println("What number is missing in the progression?");
        while (cntr < rnd) {
            int sumProgression = random.nextInt(1, maxRandomForSumProgression);
            int randomIndex = random.nextInt(1, progression.length - 1);
            progression[0] = random.nextInt(1, randomZeroArrayElement);
            System.out.print("Question: ");
            for (int i = 0; i < progression.length - 1; i++) {
                progression[i + 1] = progression[i] + sumProgression;
                System.out.print(i == randomIndex ? ".. " : progression[i] + " ");
                correctAnswer = progression[randomIndex];
            }
            System.out.print("\nYour answer: ");
            answer = scanner.nextInt();
            cntr += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cntr == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gamePrime() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        String correctAnswer = null;
        int number;
        int rnd = 3;
        int cntr = 0;
        final int maxRandom = 224;
        String username = Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (cntr < rnd) {
            number = random.nextInt(2, maxRandom);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = Engine.isPrime(number);
            cntr += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cntr == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }
}
