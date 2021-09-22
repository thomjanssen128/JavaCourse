package nl.thom.bank;

public class Account {
    // private?
    double balance;
    double interestRate; // unused? dan weg.
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

    // IDEA: Return value of the method is never used
    public boolean transfer(Account to, double amount) {
        boolean sufficientFunds = this.withdraw(amount); // methods mag je prefixen met this, maar is meestal niet nodig.
        if (!sufficientFunds) return false; // sufficientFunds kan nooit false worden; hij gooit dan een exception.

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
