package Lab3Ex1;

import java.util.Scanner;

public class Lab3Ex4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = s.nextInt();
        // s.nextLine();
        System.out.println("You are " + age + " years old!");
        System.out.println("Do you enjoy being so old?");
        String answer = s.nextLine();
    }     
}
