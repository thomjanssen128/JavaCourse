package nl.thom.bank;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Client> clients = new ArrayList<>();

    public Client makeNewClient(String firstName, String lastName) {
        Client c = makeNewClient(firstName, lastName, 0);
        return c;
    }

    public Client makeNewClient(String firstName, String lastName, double balance) {
        int id = getNewClientId();
        Client c = new Client(firstName, lastName, id, balance);
        // addClientToClientsList(c);
        return c;
    }

    void addClientToClientsList(Client c) {
        clients.add(c);
    }

    private int getNewClientId() {
        return clients.size();
    }

    public double getBankBalance() {
        // prints sum of all accounts
        double total = 0;
        for (Client c : clients) {
            // System.out.printf("%s %s has %s.\n", c.firstName, c.lastName, c.account.balance);
            total += c.account.getBalance();
        }
        // System.out.println("Total in the bank: " + total);
        return total;
    }

    public void printBankBalance() {
        System.out.println("Bank balance: " + getBankBalance());
    }

    public ArrayList<Integer> getAllClientIds() {
        ArrayList<Integer> clientIds = new ArrayList<>();
        // int[] clientIds = new int[clients.size()];
        for (Client c : clients) {
            clientIds.add(c.id);
        }
        return clientIds;
    }

    public Client getClientById(int id) {
        System.out.println(id);
        for (Client c : clients) {
            //            System.out.println(c);
            if (c.id == id) {
                return c;
            }
        }
        return null;

    }


}
