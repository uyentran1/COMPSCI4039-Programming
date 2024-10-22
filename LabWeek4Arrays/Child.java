package LabWeek4Arrays;

public class Child extends Person {
    
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
