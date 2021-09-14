package nl.thom.bank;

import java.util.ArrayList;

public class Bank {
//    static Client[] clients = new Client[0];
    static ArrayList<Client> clients = new ArrayList<>();

    public Client makeNewClient(String firstName, String lastName) {
        int id = getNewClientId();
        Client c = new Client(firstName, lastName, id);
        addClientToClientsList(c);
        return c;
    }

    public Client makeNewClient(String firstName, String lastName, double balance) {
        int id = getNewClientId();
        Client c = new Client(firstName, lastName, id, balance);
        addClientToClientsList(c);
        return c;
    }

    private void addClientToClientsList(Client c) {
//        Client[] newClients = new Client[clients.length + 1];
//        for (int i = 0; i < clients.length; i++) {
//            newClients[i] = clients[i];
//        }
//        newClients[clients.length] = c;
//        clients = newClients;
        clients.add(c);
    }



    public static int getNewClientId() {
        //int[] clientIds = getAllClientsIds();
        int newId = clients.size();
        return newId;
    }

    //    private void addNewClientId(int id) {
    //        int[] newClientIds = new int[id + 1];
    //        for (int i = 0; i < id; i++)
    //            newClientIds[i] = clientIds[i];
    //        newClientIds[id] = id;
    //        clientIds = newClientIds;
    //    }

    public void printBankBalance() {
        double total = 0;
        for (Client c : clients) {
            System.out.printf("%s %s has %s.\n", c.firstName, c.lastName, c.account.balance);
            total += c.account.balance;
        }
        System.out.println("Total in the bank: " + total);

    }

    public int[] getAllClientsIds() {

        int[] clientIds = new int[clients.size()];
        for (int i = 0; i < clients.size(); i++) {
            clientIds[i] = clients.get(i).id;
        }
        return clientIds;
    }

    public static Client getClientById(int id) {
        for (Client c : clients) {
            if (c.id == id) {
                return c;
            }
        }
        return null;

    }


}
