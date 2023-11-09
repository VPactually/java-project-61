package hexlet.code;


public class App {
    public static void main(String[] args) {

        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                0 - Exit
                Your choice:\s""");
        Cli.getInt();
        System.out.println("\n");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String username = Cli.getString();
        System.out.println("Hello, " + username + "!");

        if (Games.gameEven()){
            System.out.println("Congratulation, " + username + "!");
        } else {
            System.out.println("Let's try again, " + username + "!");
        }

    }
}
