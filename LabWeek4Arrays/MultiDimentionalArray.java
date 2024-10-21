package LabWeek4Arrays;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        printTwoDimentionArray(6);        
    }
    
    // Print a 2D array with a parameter being the number of rows and columns
    public static void printTwoDimentionArray(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j ++) {
                System.out.print(0 + " ");
            }
            for (int k = 0; k < n - i; k++) {
                System.out.print((k + 1) + " ");
            }
            System.out.println();
        }
    }
}
