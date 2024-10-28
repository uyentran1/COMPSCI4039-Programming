package LabWeek5ExceptionsAndFileIO;

public class BankAccount {
    private Person person;
    private long accountNumber;
    private double balance;
    private static int nextAccountNumber = 0;
    
    public BankAccount(Person p) {
        person = p;
        balance = 0.0;
        accountNumber = nextAccountNumber;
        nextAccountNumber++;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double amt) {
        balance = amt;
    }

    public void depositFund(double amt) {
        balance += amt;
    }

    public void withdrawFund (double amt) {
        balance -= amt;
    }

    public void transferFund(double amt, BankAccount receivingAccount) {
        withdrawFund(amt);
        receivingAccount.depositFund(amt);
    }

    @Override
    public String toString() {
        return "Name: " + person.getName() + ", " + "Account: " + accountNumber + ", Balance: " + balance;
    }
}
