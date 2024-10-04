package Lab6Ex1;

public class Person {
    // Attributes
    private String name;
    private static int age;
    private String country;

    // Constructor
    public Person(String s, int a, String c) {
        name = s;
        age = a;
        country = c;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int a) {
        age = a;
    }

    public void setName(String n) {
        name = n;
    }

    public void setCountry(String c) {
        country = c;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hi, I'm " + name + ", I'm " + age + " years old, and I come from " + country + ".");
    }

    public String toString() {
        return name + " " + age + " " + country;
    }
}
