package nl.thom.bank;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Client> clients = new ArrayList<>();

    void addClient(Client c) {
        c.setId(clients.size());
        clients.add(c);
    }

    private int getNewClientId() {
        return clients.size();
    }

    public double getBankBalance() {
        // prints sum of all accounts
        double total = 0;
        for (Client c : clients) {
            for (Account a : c.accounts) {
                total += a.getBalance();
            }
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

    @Override
    public String toString() {
        return "Bank: { \n" +
                "    clients= \n" + clients +
                '}';
    }
}
