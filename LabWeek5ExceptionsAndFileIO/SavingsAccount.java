package LabWeek5ExceptionsAndFileIO;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(Person p, double interestRate) 
    {
        super(p); // Pass the Person object
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void addInterest() 
    {
        double newBalance = this.getBalance() * (1 + interestRate / 100.0);
        this.setBalance(newBalance);
    }
        
    @Override
    // public void withdrawFund(double amt) throws InsufficientFundsException
    // {
    //     if (amt <= this.getBalance()) {
    //         super.withdrawFund(amt); // Leverage the base class method
    //     } else {
    //         throw new InsufficientFundsException("Insufficient funds for withdrawal.");
    //     }
    // }
    public void withdrawFund(double amt) {
        try {
            if (amt <= this.getBalance()) {
                super.withdrawFund(amt); // Leverage the base class method
            } else {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString()
    {
        return "Savings Account: " + getAccountNumber() + ", balance: " + getBalance() + ", interest rate: " + interestRate; 
    }

    public static void main(String[] args) {
        SavingsAccount sa1 = new SavingsAccount(new Person("Naomi", 21), 4.5);

        sa1.setBalance(1000);
        sa1.withdrawFund(500);
        sa1.withdrawFund(200);
        sa1.withdrawFund(600);
    }
}
