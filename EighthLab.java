//Written by:	Justin Barba
//Assignment:  Lab 8.2
//Class:	CS 113
//Date:	5/3/2024
//Description: This is a program that allows two users to play a game of dice. 
//             At the end of the program it displays the total points and winner.
import java.util.Scanner;
public class EighthLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain;
        // This loop allows the user to repeat the game
        do {
            int player1Points = 0;
            int player2Points = 0;
            // This loop simulates 10 rounds of the game
            for (int round = 1; round <= 10; round++) {
                System.out.println("Roll " + round);
                // Roll dice for player 1
                int player1Dice1 = (int) (Math.random() * 6) + 1;
                int player1Dice2 = (int) (Math.random() * 6) + 1;
                System.out.println("Player 1: " + player1Dice1 + " and " + player1Dice2);
                // Roll dice for player 2
                int player2Dice1 = (int) (Math.random() * 6) + 1;
                int player2Dice2 = (int) (Math.random() * 6) + 1;
                System.out.println("Player 2: " + player2Dice1 + " and " + player2Dice2);
                if (player1Dice1 == player1Dice2) {
                    player1Points++;
                }
                if (player2Dice1 == player2Dice2) {
                    player2Points++;
                }
            }
            // Output points for each player
            System.out.println("Player 1: " + player1Points);
            System.out.println("Player 2: " + player2Points);
            // This determines the winner
            if (player1Points > player2Points) {
                System.out.println("Player 1 wins.");
            } else if (player2Points > player1Points) {
                System.out.println("Player 2 wins.");
            } else {
                System.out.println("It's a tie.");
            }
            // This asks if the user wants to play again
            System.out.print("Do you want to repeat? (Enter 'Y' or 'y' to repeat. Any other letter to quit): ");
            playAgain = scanner.next().charAt(0);
        } while (Character.toLowerCase(playAgain) == 'y');
        // This is a farewell message
        System.out.println("Thank you for playing. Goodbye!");
        scanner.close();
    }
}
