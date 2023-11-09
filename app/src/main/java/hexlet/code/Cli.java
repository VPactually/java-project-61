package hexlet.code;
import java.util.Scanner;

public class Cli {

    public static int getInt(){
        Scanner scanner = new Scanner(System.in);
        int number=0;
        if (scanner.hasNextInt()) {
            number = scanner.nextInt();
        } else {
            return 0;
        }
        return number;
    }

    public static String getString(){
        Scanner scanner = new Scanner(System.in);
        String string = "";
        if (scanner.hasNextLine()) {
            string = scanner.nextLine();
        } else {
            return string;
        }
        return string;
    }
}
