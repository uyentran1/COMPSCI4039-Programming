package Lab6Ex1;

public class Polymorphism {
    public static void main(String[] args)
    {
        Person p = new Person("Julian", 21, "Vietnam");
        BankAccount b = new SavingsAccount(p, 3.0);

        // b.addInterest(5000); This cannot work. b can only call methods of the reference class.
        
        System.out.println(b); // b calls the toString method of SavingsAccount (it overrides that of BankAccount)
    }  
}
