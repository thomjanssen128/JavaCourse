package nl.thom.h9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bank {

    private List<Account> accounts = new ArrayList<>();


    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public void withdraw(Account a, double amount) {
        for (Account ac : accounts) {
            if (ac == a) {
                a.withdraw(amount);
            }
        }
    }

    public double getTotalAmount() {
        double total = 0;

        for (Account a : accounts) { // for each
            double balance = a.getBalance(); // hier maakt mijn code een uitstapje naar een andere class
            total += balance;
        }

        return total;
    }

    public void addAccount(Account account) {
        if (validAccount(account)) {
            this.accounts.add(account);
        }
    }

    private boolean validAccount(Account account) {
        for (Account a: accounts) {
            if (account.accountNumber.equals(a.accountNumber)) {
                return false;
            }
        }
        return true;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
