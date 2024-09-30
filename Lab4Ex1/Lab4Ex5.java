package Lab4Ex1;

public class Lab4Ex5 {
    public static void main(String[] args) {
        double a = 1;
        double b = 1.6;
        wholeDivision(a, b);
    }

    // Print the number of num2s that can fit into num1 and the remainder
    public static void wholeDivision(double num1, double num2) {
        int wholeTimes = 0;
        double temp = 0;

        while ((temp < num1) && ((temp + 1) < num1)) {
            temp += num2;
            wholeTimes += 1;
        }

        double remainder = num1 - temp;

        System.out.println(num2 + " can fit " + wholeTimes + " times into " + num1 + " with a remainder of " + remainder);
    }
}