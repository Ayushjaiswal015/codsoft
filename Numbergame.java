import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int totalscore =0;
        boolean playagain = true;
        int round = 0;
        
        System.out.println("Welcome to the Number Game!!");
        
        while (playagain) {
            round++;
            int numberguess = random.nextInt(100) + 1;
            int userguess = 0;
            int attempts = 0;
            int maxattempts = 10;

            System.out.println("\nRound " + round + ": I have selected a nuber between 1 to 100. Try to guess it!");
            System.out.println("You have a maximum of" + maxattempts + "attempts.");

            while (userguess != numberguess && attempts < maxattempts) {
                System.out.println("Enter you guess: ");
                userguess = scanner.nextInt();
                attempts++;

                if (userguess < numberguess) {
                    System.out.println("Too low! Try again.");
                }
                else if (userguess > numberguess) {
                    System.out.println("Too high! Try again.");
                }
                else {
                    System.out.println("Congratulations! You guessed the number!");
                    totalscore += (maxattempts - attempts + 1);
                }
            }
            if (attempts == maxattempts && userguess != numberguess) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberguess + ".");
            }

            System.out.println("Your score for this round: " + (maxattempts - attempts + 1));
            System.out.println("Total score: " + totalscore);

            System.out.println("Do you want to play again? (yes/no): ");
            playagain = scanner.next().equalsIgnoreCase("yes");
        }

        System.out.println("Thankyou for playing! Your final score is " + totalscore + ".");
        scanner.close();
   }
}
