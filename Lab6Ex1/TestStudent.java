package Lab6Ex1;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(3.8);

        System.out.println(student.getGpa());

        student.setGpa(3.7);

        System.out.println(student.getGpa());
        System.out.println(student);
        }
}
