package hexlet.code;

import java.util.Scanner;

public class Engine {
    private Scanner scanner = new Scanner(System.in);
    private String answer;
    private String correctAnswer;
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public int getChoice() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            return 0;
        }
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return this.answer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect() {
        return answer.equalsIgnoreCase(correctAnswer);
    }

    public String getIfWin() {
        return "Congratulations, " + this.getUsername() + "!";
    }

    public String getIfLose() {
        return "'" + getAnswer() + "' is wrong answer ;(. " + "Correct answer was '"
                + this.getCorrectAnswer() + "'." + "\nLet's try again, " + this.getUsername() + "!";
    }

}
