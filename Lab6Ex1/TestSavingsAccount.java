package Lab6Ex1;

public class TestSavingsAccount {
    public static void main(String[] args) {
        Person person1 = new Person("Naomi", 21, "America");

        SavingsAccount savingsAcc1 = new SavingsAccount(person1, 20);

        System.out.println(savingsAcc1);
        
        savingsAcc1.depositFund(2000);
        System.out.println(savingsAcc1);
        
        savingsAcc1.withdrawFund(1000);
        System.out.println(savingsAcc1);

        savingsAcc1.withdrawFund(1500);
        System.out.println(savingsAcc1);
        
        savingsAcc1.addInterest();
        System.out.println(savingsAcc1);
    }
}
