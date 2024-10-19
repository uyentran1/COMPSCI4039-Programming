package LabWeek4Arrays;

import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random r = new Random();
        double d;
        double[] randomNumbers = new double[100];

        // Polulate the array with random numbers
        for (int i = 1; i < randomNumbers.length; i++) {
            d = r.nextDouble();
            randomNumbers[i] = d;
        }

        double a = average(randomNumbers);
        System.out.printf("Average value: %f\n", a);

        int[] myIntArray = {0, 2, 4, 6, 8, 2};
        int[] myIntArray2 = {1, 2, 3, 4, 5};
        System.out.println(findInt(myIntArray, 2));
        System.out.println(findInt(myIntArray, 3));
        System.out.println();
        System.out.println(findLastInt(myIntArray, 2));
        System.out.println(findLastInt(myIntArray, 3));

        findAllInts(myIntArray, 2);
        findAllInts(myIntArray2, 6);
        }

    // Compute the avarage value of an array's elements
    public static double average(double[] array) {
        double sum = 0;

        for (double d : array)
            sum += d;

        return sum / array.length;
    }

    // Find first occurence of an int in an integer array
    // Return the index if found, return -1 if not
    public static int findInt(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Find last occurence of an int in an integer array
    // Return the index if found, return -1 if not
    public static int findLastInt(int[] array, int target) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Find all occurences of an int in an integer array
    // Print indexes of occurences found
    public static void findAllInts(int[] array, int target) {
        ArrayList<Integer> indexes = new ArrayList<>(0);
    
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indexes.add(i);
            }
        }

        if (indexes.isEmpty()) 
            System.out.printf("No element of value %d in input array\n", target);
        else {
            for (Integer index : indexes)
                System.out.print(index + " ");
            System.out.println();
        }
    }
}
