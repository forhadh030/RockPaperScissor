// Console.java
package video_game;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Console extends RockPaperScissor {

    public static void main(String[] args) throws InterruptedException {

        // Create the game
        Console playGame = new Console();
        Scanner player = new Scanner(System.in);
        int computerChoice = 0;
        String computer;
        System.out.print("Type 1 for Rock, 2 for Paper, 3 for Scissor or 4 to exit program: ");

        // Player option since computer is random
        int choice;
        boolean continueGame = true;
        do {
            choice = player.nextInt();
            String playerChoice;
            switch (choice) {
                case 1 -> playerChoice = "Rock";
                case 2 -> playerChoice = "Paper";
                case 3 -> playerChoice = "Scissor";
                case 4 -> {
                    System.out.println("Exiting Program.");
                    player.close();
                    return; // Exiting the program
                }
                default -> {
                    System.out.println("Invalid option! READ!");
                    continue;
                }
            }

            // Generate computer's choice
            computerChoice = (int) Math.ceil(Math.random() * 3);
            computer = switch (computerChoice) {
                case 1 -> "Rock";
                case 2 -> "Paper";
                case 3 -> "Scissor";
                default -> "Unknown";
            };

            System.out.println("Player: " + playerChoice);
            System.out.println("Computer: " + computer);

            // PLAY THE GAME!
            playGame.Rules(playerChoice, computer);

            System.out.print("Type The Number: 1 - Rock, 2 - Paper, 3 - Scissor or 4 - exit program: ");
        } while (true); // Infinite loop until the player chooses to exit
    }
}
