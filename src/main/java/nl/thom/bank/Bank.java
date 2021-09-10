package nl.thom.bank;

public class Bank {
    int clientIds[] = new int[0];
    Client[] clients = new Client[0];


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
        Client[] newClients = new Client[clients.length + 1];
        for (int i = 0; i < clients.length; i++) {
            newClients[i] = clients[i];
        }
        newClients[clients.length] = c;

        clients = newClients;
    }

    public int getNewClientId() {
        int newId = clientIds.length;
        addNewClientId(newId);
        return newId;
    }

    private void addNewClientId(int id) {
        int[] newClientIds = new int[id + 1];
        for (int i = 0; i < id; i++)
            newClientIds[i] = clientIds[i];
        newClientIds[id] = id;
        clientIds = newClientIds;
    }

    public Client getClientById(int id) {
        for (Client c : clients) {
            if (c.id == id) {
                return c;
            }
        }
        return null;

    }


}
