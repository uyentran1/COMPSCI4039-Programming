package Lab4Ex1;

import java.util.Random;
import java.util.Scanner;

public class Lab4Ex3 {
    // Prompt the user to guess a random number five times, after that print the random number
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(100);

        Scanner keyboard = new Scanner(System.in);

        int i = 0;
        do {
            
            System.out.println("Guess a number.");
            int userNum = keyboard.nextInt();
            
            if (userNum == randomNum) {
                System.out.println("You are correct!");
                keyboard.close();
                break;
            }
            
            i++;
        }
        while (i < 5);
                
        System.out.println("The random number is: " + randomNum);
        keyboard.close();
    }
}
