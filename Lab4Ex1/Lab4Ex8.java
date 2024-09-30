package Lab4Ex1;

import java.util.Scanner;

public class Lab4Ex8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = s.nextInt();

        int ones = num % 10;
        int tens = (num % 100 - ones) / 10;
        int hundreds = (num - tens * 10 - ones) / 100;

        if (num == Math.pow(ones, 3) + Math.pow(tens, 3) + Math.pow(hundreds, 3)) {
            System.out.printf("%d is an Armstrong number.\n", num);
        }

        s.close();
    }
    
}
