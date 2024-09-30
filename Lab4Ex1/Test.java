package Lab4Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        boolean acceptable = false;

        while (!acceptable) {
            System.out.println("Enter your name.");
            String name = s.nextLine();

            if (name.equals("Simon")) {
                acceptable = true;
            }
        }

        s.close();

        System.out.println("Welcome, Simon.");       
    }
}
