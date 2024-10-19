package Lab3Ex1;

import java.util.Scanner;

public class Lab3Ex4 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter your age: ");
            int age = s.nextInt();
            System.out.println("You are " + age + " years old!");
            System.out.println("Do you enjoy being so old?");
            String answer = s.nextLine();
        }
    }     
}
