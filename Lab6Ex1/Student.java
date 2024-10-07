package Lab6Ex1;

public class Student extends Person {
    private double gpa;

    public Student(double gpa) {
        super("Anna", 18, "Mexico");
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa (double gpa) {
        this.gpa = gpa;
    }

    public String toString() {
        return "Student name: " + name + ", GPA: " + gpa;
    }
}
