package Lab7Ex1;

import java.util.Arrays;

public class NameGrade 
{
    public static void main(String[] args) 
    {
        int[] grades = {87, 99, 1, 34};
        // String[] names = {"Amy", "Bill", "Fred", "Clare"};

        // for (int i = 0; i < grades.length; i++)
        // {
        //     System.out.println(names[i] + " " + grades[i]);
        // }
        // System.out.println("");

        // bubbleSort(grades); // This sorts grades but not names

        Arrays.sort(grades);

        System.out.println("Sorted");
        
        for (int grade : grades)
            System.out.println(grade);
    }

    // public static void bubbleSort(int[] a)
    // {
    //     boolean anyChanged;
    //     do
    //     {
    //         anyChanged = false;
    //         for (int i = 0; i < a.length - 1; i++)
    //         {
    //             if (a[i] > a[i + 1])
    //             {
    //                 anyChanged = true;
    //                 int temp = a[i];
    //                 a[i] = a[i + 1];
    //                 a[i + 1] = temp;
    //             }
    //         }
    //     }
    //     while (anyChanged);
    // }
}
