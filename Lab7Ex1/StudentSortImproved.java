package Lab7Ex1;

import java.util.Arrays;

public class StudentSortImproved {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Amy", 87),
            new Student("Bill", 99),
            new Student("Fred", 1),
            new Student("Clare", 34)
        };

        Arrays.sort(students);

        for (Student student : students)
            System.out.println(student);
    }
}