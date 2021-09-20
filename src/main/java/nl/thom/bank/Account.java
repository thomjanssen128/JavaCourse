package nl.thom.bank;

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

    public boolean withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Not enough money in your account.");

        } else {
            balance -= amount;
            return true;
        }
    }

    public boolean transfer(Account to, double amount) {
        boolean sufficientFunds = this.withdraw(amount);
        if (!sufficientFunds) return false;

        to.balance += amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
