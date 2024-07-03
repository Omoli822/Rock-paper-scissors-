import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"Rock", "Paper", "Scissors"};

        System.out.println("Welcome to Rock-Paper-Scissors!");
        System.out.println("Enter 0 for Rock, 1 for Paper, or 2 for Scissors.");

        while (true) {
            System.out.print("Your choice: ");
            int userChoice = scanner.nextInt();

            if (userChoice < 0 || userChoice > 2) {
                System.out.println("Invalid choice. Please enter 0, 1, or 2.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            System.out.println("Computer chose: " + options[computerChoice]);

            if (userChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if ((userChoice == 0 && computerChoice == 2) ||
                       (userChoice == 1 && computerChoice == 0) ||
                       (userChoice == 2 && computerChoice == 1)) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            scanner.nextLine(); // Clear the buffer
            String playAgain = scanner.nextLine();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }

        scanner.close();
        System.out.println("Thanks for playing!");
    }
}

