package nl.thom.h9;

public class Account {

    public String accountNumber;
    private double balance;

    public Account(String accountNumber) {
        this(accountNumber, 0);
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        // this.balance = this.balance + amount;
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance - amount < 0) {
            throw new IllegalArgumentException("Negatief saldo is niet toegestaan.");
        } else {
            // this.balance = this.balance - amount;
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                " number=" + accountNumber +
                " balance=" + balance +
                '}';
    }
}
