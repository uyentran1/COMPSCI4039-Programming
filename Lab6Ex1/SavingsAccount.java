package Lab6Ex1;

public class SavingsAccount extends BankAccount {
    static Person person1 = new Person("Naomi", 21, "USA");
    private double interestRate;

    public SavingsAccount(double interestRate) {
        super(person1);
        this.interestRate = interestRate;
    }

    @Override
    public void withdrawFund(double amt) {
        if (amt <= this.getBalance()) {
            double newBalance = this.getBalance() - amt;
            this.setBalance(newBalance);
        }
    }

    public void addInterest() {
        double newBalance = this.getBalance() * (1 + interestRate/100.0);
        this.setBalance(newBalance);
    }
}
