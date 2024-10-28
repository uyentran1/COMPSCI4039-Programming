package LabWeek5ExceptionsAndFileIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner s = new Scanner(System.in);
        int userInt = 0;
        boolean validInput = false;

        while (!validInput)
        {
            try {
                userInt = s.nextInt();
                validInput = true; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Not an integer. Please try again.");
                s.next(); // Clear the invalid input
            }
        }

        System.out.printf("You entered %d\n", userInt);
    }
}
