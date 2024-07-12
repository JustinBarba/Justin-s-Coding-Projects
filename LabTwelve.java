//Written by:	Justin Barba
//Assignment:  Lab 12
//Class:	CS 113
//Date:	5/29/2024
//Description: Enter a maximum of ten scores, the valid scores are from 0 to 100. 
//             Also enter a minimum score to pass. This program will then 
//             list all of the scores, number of students passing, 
//             highest score, lowest score, and average of scores.
import java.util.Scanner;
public class LabTwelve {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final int MAX_SCORES = 10;
        int[] scores = new int[MAX_SCORES];
        boolean repeatProgram;
        do {
            // This prompts the user for the number of scores
            int numScores;
            while (true) {
                System.out.println("This program will calculate the number of students passing,highest score, lowest score, and average of scores of the valid scores you entered.");
                System.out.print("Enter number of scores (10 max): ");
                numScores = scnr.nextInt();
                if (numScores > 0 && numScores <= MAX_SCORES) {
                    break;
                } else {
                    System.out.println("Incorrect value. Try again.");
                }
            }
            for (int i = 0; i < numScores; i++) {
                while (true) {
                    System.out.print("Score " + (i + 1) + ": ");
                    scores[i] = scnr.nextInt();
                    if (scores[i] >= 0 && scores[i] <= 100) {
                        break;
                    } else {
                        System.out.println("Not valid. Try again.");
                    }
                }
            }
            // This prompt the user for the minimum passing score
            System.out.print("Minimum score to pass: ");
            int minPassScore = scnr.nextInt();
            // This calculates the number of students passing, highest score, lowest score, and average score
            int passingCount = 0;
            int highestScore = scores[0];
            int lowestScore = scores[0];
            int totalScore = 0;
            for (int i = 0; i < numScores; i++) {
                if (scores[i] >= minPassScore) {
                    passingCount++;
                }
                if (scores[i] > highestScore) {
                    highestScore = scores[i];
                }
                if (scores[i] < lowestScore) {
                    lowestScore = scores[i];
                }
                totalScore += scores[i];
            }
            // This calculates the average score
            double averageScore = (double) totalScore / numScores;
            System.out.print("List of scores:\n");
            for (int i = 0; i < numScores; i++) {
                System.out.print(scores[i]);
                if (i < numScores - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
            System.out.println("Number of students passing: " + passingCount);
            System.out.println("Highest score: " + highestScore);
            System.out.println("Lowest score: " + lowestScore);
            System.out.printf("Average of scores: %.2f\n", averageScore);
            // This aska the user if they want to repeat the program
            System.out.print("Repeat? Enter \"Y\" or \"y\" for yes, any other input to quit: ");
            String repeat = scnr.next();
            repeatProgram = repeat.equalsIgnoreCase("Y");
        } while (repeatProgram);
    }
}
