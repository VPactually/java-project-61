package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Games {

    public static void gameEven() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        String correctAnswer = null;
        int number;
        int cnt = 0;
        int rnd = 3;
        String username = Engine.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (cnt < rnd) {
            number = random.nextInt(0, 100);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = number % 2 == 0 ? "yes" : "no";
            cnt += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cnt == rnd ? Engine.getIfLose(answer, correctAnswer, username) : Engine.getIfWin(username));
    }

    public static void gameCalc() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int cnt = 0;
        int answer = 0;
        int correctAnswer = 0;
        int rnd = 3;
        String[] operators = {"+", "-", "*"};
        String operator;
        String username = Engine.greet();
        System.out.println("What is the result of the expression?");
        while (cnt < rnd) {
            number1 = random.nextInt(0, 100);
            number2 = random.nextInt(0, 100);
            operator = operators[random.nextInt(3)];
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
                default -> {
                    System.out.println("Wrong choice.");
                }
            }
            answer = scanner.nextInt();
            cnt += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cnt == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gameGcd() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        int cnt = 0;
        int answer = 0;
        int correctAnswer = 0;
        int rnd = 3;
        String username = Engine.greet();
        System.out.println("Find the greatest common divisor of given numbers.");
        while (cnt < rnd) {
            number1 = random.nextInt(0, 101);
            number2 = random.nextInt(0, 101);
            System.out.println("Question: " + number1 + " " + number2 + "\nYour answer: ");
            answer = scanner.nextInt();
            correctAnswer = Engine.getGcd(Math.max(number1, number2), Math.min(number1, number2));
            cnt += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cnt == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gameProgression() {
        Random random = new Random();
        int[] progression = new int[10];
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        int correctAnswer = 0;
        String username;
        int number;
        int cnt = 0;
        int rnd = 3;
        username = Engine.greet();
        System.out.println("What number is missing in the progression?");
        while (cnt < rnd) {
            int sumProgression = random.nextInt(1, 12);
            int randomIndex = random.nextInt(1, 9);
            progression[0] = random.nextInt(1, 10);
            System.out.print("Question: ");
            for (int i = 0; i < progression.length - 1; i++) {
                progression[i + 1] = progression[i] + sumProgression;
                System.out.print(i == randomIndex ? ".. " : progression[i] + " ");
                correctAnswer = progression[randomIndex];
            }
            System.out.print("\nYour answer: ");
            answer = scanner.nextInt();
            cnt += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cnt == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }

    public static void gamePrime() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        String correctAnswer = null;
        int number;
        int cnt = 0;
        int rnd = 3;
        String username = Engine.greet();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (cnt < rnd) {
            number = random.nextInt(2, 224);
            System.out.print("Question: " + number + "\nYour answer: ");
            answer = scanner.nextLine();
            correctAnswer = Engine.isPrime(number);
            cnt += Engine.result(Engine.isCorrectAnswer(answer, correctAnswer));
        }
        System.out.println(cnt == rnd ? Engine.getIfWin(username) : Engine.getIfLose(answer, correctAnswer, username));
    }
}
