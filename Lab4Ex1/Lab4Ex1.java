package Lab4Ex1;

public class Lab4Ex1 {
    //
    public static void main(String[] args) {
        printFirstTenTerms(5);
    }

    // Print an integer's first ten terms of its times table
    public static void printFirstTenTerms(int num) {
        for (int i = 0; i < 10; i++) {
            System.out.println(num + " x " + (i + 1) + " = " + (num * (i + 1)));
        }

    }
}