package nl.thom.bank;

public class App {
    public static void main(String[] args) {
        Bank b = new Bank();

        Client c = new Client();

        b.addClient(c);

        Account a1 = new Account();
        Account a2 = new Account();

        c.addAccount(a1);
        c.addAccount(a2);

        Client c2 = new Client();

        b.addClient(c2);
        Account A = new Account(234);
        c2.addAccount(A);


        System.out.println(b);

    }

}
