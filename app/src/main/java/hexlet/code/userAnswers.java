package hexlet.code;

public class userAnswers {
    public static int getInt() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = 0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            return 0;
        }
        return number;
    }

    public static String getString() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String string = "";
        if (scanner.hasNextLine()) {
            string = scanner.nextLine();
        } else {
            return string;
        }
        return string;
    }
}
