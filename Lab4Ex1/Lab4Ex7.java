package Lab4Ex1;

import java.util.Scanner;
import java.util.Random;

public class Lab4Ex7 {
    public static void main(String[] args) {
        int computerScore = 0;
        int userScore = 0;
        
        // Play 3 times
        for (int i = 0; i < 3; i++) {
            String computerChoice = getComputerChoice();
            System.out.println("Computer choice: " + computerChoice);
            System.out.println();

            String userChoice = getUserChoice();
            
            if (computerChoice.equals(userChoice)) {
                System.out.println("Draw!");
            }
            else if (computerChoice.equals("Rock")) {
                if (userChoice.equals("Paper")) {
                    userScore += 1;  
                }
                else if (userChoice.equals("Scissors")) {
                    computerScore += 1;
                }
            }
            else if (computerChoice.equals("Paper")) {
                if (userChoice.equals("Rock")) {
                    computerScore += 1;
                }
                else if (userChoice.equals("Scissors")) {
                    userScore += 1;
                }

            }
            else if (computerChoice.equals("Scissors")) {
                if (userChoice.equals("Rock")) {
                    userScore += 1;
                }
                else if (userChoice.equals("Paper")) {
                    computerScore += 1;
                }
            }  
            
            System.out.println("Round " + (i + 1) + " result:");
            System.out.println("Computer score: " + computerScore);
            System.out.println("User score: " + userScore);
            System.out.println();
        } 
        
        if (computerScore > userScore) {
            System.out.println("Computer wins!");
        } else if (computerScore < userScore) {
            System.out.println("User wins!");
        } else {
            System.out.println("Draw!");
        }

    }

    public static String getComputerChoice() {
        String computerChoice;

        Random rand = new Random();
        int randomNumber = rand.nextInt(3); // 3 is excluded

        if (randomNumber == 0) {
            computerChoice = "Rock";
        }
        else if (randomNumber == 1) {
            computerChoice = "Paper";
        }
        else {
            computerChoice = "Scissors";
        }

        return computerChoice;
    }

    public static String getUserChoice() {
        Scanner keyboard = new Scanner(System.in);

        String userChoice;
        // do {
        System.out.println("Enter your choice: Rock, Paper, or Scissors.");
        userChoice = keyboard.nextLine();
        // }
        // while (!(userChoice == "Rock" || userChoice == "Paper" || userChoice == "Scissors"));

        
        // keyboard.close();
        return userChoice;
    }


}
