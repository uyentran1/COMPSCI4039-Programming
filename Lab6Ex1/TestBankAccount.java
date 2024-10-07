package Lab6Ex1;

public class TestBankAccount {
    public static void main(String[] args) {
        Person person1 = new Person("Adrian", 30, "Australia");
        // Person person2 = new Person("Naomi", 21, "America");
        
        BankAccount acc1 = new BankAccount(person1);
        BankAccount acc2 = new BankAccount(person1);

        acc1.depositFund(1000);
        acc1.withdrawFund(500);

        acc2.depositFund(2000);
        acc2.withdrawFund(400);
        
        System.out.println(acc1);
        System.out.println(acc2);
        
        acc1.transferFund(50, acc2);
        
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
