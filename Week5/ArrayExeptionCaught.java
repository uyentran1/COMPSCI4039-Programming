package Week5;

import java.util.Random;

public class ArrayExeptionCaught {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        Random r = new Random();

        try {
            int pos = r.nextInt(20);
            System.out.println(myArray[pos]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Too big");
            e.printStackTrace();
        } finally {
            System.out.println("This happens whatever");
        }
    }
}