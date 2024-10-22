package LabWeek4Arrays;

public class PersonArray {
    public static void main(String[] args) {
        // Create an array of Person objects
        Person[] people = new Person[4];
        people[0] = new Person("Ti", 21);
        people[1] = new Person("Emily", 25);
        people[2] = new Person("Naomi", 33);
        people[3] = new Person("Ben", 35);

        people[3].sayHello();

        int totalAge = compTotalAge(people);
        System.out.println(totalAge);

        System.out.println(people[2]);
        people[2].addDependant(new Child("Nolan", 8));
        people[2].addDependant(new Child("Amy", 4));
        people[2].addDependant(new Child("Ryan", 3));
        people[2].addDependant(new Child("Jessie", 1));
        System.out.println(people[2]);
    }
    
    public static int compTotalAge(Person[] array) {
        int totalAge = 0;
        for (Person person : array) {
            totalAge += person.getAge();
        }
        return totalAge;
    }
}
