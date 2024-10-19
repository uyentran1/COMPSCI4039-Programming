package Lab7Ex1;

public class StudentSort 
{
    public static void main(String[] args) 
    {
        Student[] students = new Student[4];
        students[0] = new Student("Amy", 87);
        students[1] = new Student("Bill", 99);
        students[2] = new Student("Fred", 1);
        students[3] = new Student("Clare", 34);

        System.out.println("Unsorted");
        for (Student student : students)
            System.out.println(student);


        sort(students);

        System.out.println("\nSorted");

        for (Student student : students)
            System.out.println(student);

    }    

    public static void sort(Student[] s)
    {
        boolean anyChanged;
        do 
        {
            anyChanged = false;
            for (int i = 0; i < s.length - 1; i++)
            {
                if (s[i].getGrade() > s[i + 1].getGrade())
                {
                    anyChanged = true;
                    Student temp = s[i];
                    s[i] = s[i + 1];
                    s[i + 1] = temp;
                }
            }
        } while (anyChanged);
    }
}
