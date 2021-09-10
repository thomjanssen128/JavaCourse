package nl.thom.bank;

public class Client {
    Bank bank;
    String firstName;
    String lastName;
    int id;
    Account account;

    public Client(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        account = new Account();
    }

    public Client(String firstName, String lastName, int id, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;

        account = new Account();
        account.balance = balance;
    }
    @Override
    public String toString() {
        return "Client{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", account=" + account +
                '}';
    }
}
