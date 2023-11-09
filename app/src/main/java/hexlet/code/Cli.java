package hexlet.code;
import java.util.Scanner;

public class Cli {
    static String greeting() {
        Scanner scanner = new java.util.Scanner(System.in);
        String username = "";
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        if (scanner.hasNextLine()) {
            username = scanner.nextLine();
            System.out.println("Hello, " + username + "!");
        } else {
            return username;
        }
        return username;
    }

}
