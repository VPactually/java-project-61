package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        if (scanner.hasNextLine()) {
            String username = scanner.nextLine();
            System.out.println("Hello, " + username + "!");
        } else {
            System.out.println("Invalid input.");
        }
        scanner.close();
    }

}
