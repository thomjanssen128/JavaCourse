package nl.thom.bank;

import java.util.ArrayList;

public class Client {
    String firstName;
    String lastName;
    int id;
    ArrayList<Account> accounts = new ArrayList<>();
    static int accountId = 100_000_000;


    public Client() {
        this("UNKNOWNFIRSTNAME", "UNKNOWNLASTNAME");
    }

    public Client(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //account.balance = balance;
    }

    public void addAccount(Account acc) {
        acc.setAccountNumber(accountId);
        accountId++;
        accounts.add(acc);
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", accounts=" + accounts +
                '}';
    }
}
