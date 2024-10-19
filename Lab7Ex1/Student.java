package Lab7Ex1;

public class Student 
{
    private int grade;
    private String name;

    public Student(String n, int g)
    {
        name = n;
        grade = g;
    }
    
    public int getGrade() 
    {
        return grade;
    }

    @Override
    public String toString()
    {
        return name + " " + grade;
    }
}
