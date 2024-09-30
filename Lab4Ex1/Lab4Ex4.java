package Lab4Ex1;

public class Lab4Ex4 {
    public static void main(String[] args) {
        printTriangle(9);
    }

    public static void printTriangle(int numOfRows) {
        for (int i = 0; i < numOfRows; i++) {
            // Print spaces at beginning of line
            for (int j = numOfRows - (i + 1); j > 0; j--) {
                System.out.print(" ");
            }
            
            // Print the numbers and spaces 
            for (int k = 0; k < i + 1; k++) {
                System.out.print((i + 1) + " ");
            }

            System.out.println();            
        }
    }
}