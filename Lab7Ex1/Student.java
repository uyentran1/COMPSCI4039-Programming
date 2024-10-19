package Lab7Ex1;

public class Student implements Comparable<Student> {
    private int grade;
    private String name;

    public Student(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
    
    public int getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.grade, other.grade); // Compare by grades
    }

    @Override
    public String toString() {
        return name + " " + grade;
    }
}