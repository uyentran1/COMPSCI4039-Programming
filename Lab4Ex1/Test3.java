package Lab4Ex1;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name;

        do {
            System.out.println("Enter your name.");
            name = s.next();
        }
        while (!name.equals("riley"));

        System.out.println("hello riley");

        s.close();
    }
    
}
