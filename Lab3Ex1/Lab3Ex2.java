package Lab3Ex1;

import java.util.Scanner;

public class Lab3Ex2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.err.println("What is the radius?");
        double radius = keyboard.nextDouble();
        keyboard.close();

        summeriseCircle(radius);
    }

    // Print the area and circumference of the circle based on passed in radius
    public static void summeriseCircle(double radius) {
        double area = compArea(radius);
        double circumference = compCircumference(radius);
        System.out.println("Area         : " + area);
        System.out.println("Circumference: " + circumference);
    }

    // Return the area of a circle based on passed in radius
    public static double compArea(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        return area;
        }
        
    // Return the circumference of a circle based on passed in radius
    public static double compCircumference(double radius) {
        double pi = 3.14;
        double circumference = 2 * pi * radius;
        return circumference;
    }
}