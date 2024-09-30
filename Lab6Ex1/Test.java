package Lab6Ex1;
public class Test {
    public static void main(String[] args) {
        // Make a person
        Person personOne = new Person("Bill", 56, "Mexico");
        // Person personTwo = new Person("Fred", 23, "France");
        Person personThree = new Person("Naomi", 22, "Japan");

        System.out.println(personOne.getAge());
        personOne.setAge(99);
        System.out.println(personOne.getAge());
        System.out.println(personOne);
        
        System.out.println();

        System.out.println(personThree);
        personThree.sayHello();


    }
}
