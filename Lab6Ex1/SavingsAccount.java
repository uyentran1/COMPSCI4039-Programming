package Lab6Ex1;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(Person p, double interestRate) 
    {
        super(p); // Pass the Person object
        this.interestRate = interestRate;
    }

    public void addInterest() 
    {
        double newBalance = this.getBalance() * (1 + interestRate / 100.0);
        this.setBalance(newBalance);
    }
        
    @Override
    public void withdrawFund(double amt) 
    {
        if (amt <= this.getBalance()) {
            super.withdrawFund(amt); // Leverage the base class method
        }
    }

    @Override
    public String toString()
    {
        return "Savings Account: " + getAccount() + ", interest rate: " + interestRate; 
    }
}
