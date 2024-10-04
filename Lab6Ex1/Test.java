package Lab6Ex1;
public class Test {
    public static void main(String[] args) {
        // Make a person
        Person personOne = new Person("Bill", 56, "Mexico");
        Person personTwo = personOne;
        Person personThree = new Person("Naomi", 33, "America");

        personTwo.sayHello();
        personThree.sayHello();
        personTwo.setAge(70);
        personTwo.sayHello();
        personOne.sayHello();
        personThree.sayHello();
    }
}
