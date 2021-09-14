package nl.thom.bank;

import nl.thom.bank.exceptions.InsufficientFundsException;

public class Account {
    double balance;
    double interestRate;
    Client owner;
    int accountNumber;

    public Account() {
        // empty
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            try {
                throw new InsufficientFundsException("Not enough money in your account.");
            } catch (InsufficientFundsException e) {
                e.printStackTrace();
            }
        } else {
            balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
