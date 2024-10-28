package LabWeek5ExceptionsAndFileIO;

public class Person {
    // Attributes
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void sayHello() {
        System.out.println("Hi, I'm " + name + ", I'm " + age + " years old.");
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
