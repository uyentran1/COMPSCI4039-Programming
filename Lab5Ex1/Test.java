package Lab5Ex1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter your age\n");
        int age = s.nextInt();
        System.out.printf("You are %d years old!\n", age);
        // s.nextLine(); // There must be this line
        System.out.printf("Do you like being so old?\n");
        String answer = s.nextLine();
        System.out.printf("Your answer was %s\n", answer);

        s.close();
    }
}
