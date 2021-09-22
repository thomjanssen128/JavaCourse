package nl.thom.bank;

// ik zie dat je repo 'test' heet. Dat kan beter. Een repo kun je gewoon renamen in github.

public class App {
    public static void main(String[] args) {
        Bank b = new Bank();

        // leuk via een zgn. 'factory method' een client aanmaken, maar waarom doe je dat eigenlijk zo?
        // kan toch ook via de constructor? het kan handig zijn hoor, maar even benieuwd.
        Client tp = b.makeNewClient("Tom", "Poes", 234);
        Client bb = b.makeNewClient("Bulle", "Bas");

        // Leuk dat je er een Client bij bedacht hebt, maar in de praktijk
        // bouw je alleen wat gevraagd is, anders moetje het eerst met de product owner of klant overleggen.
        // Dit is in de case wel belangrijk.

        System.out.println(tp);
        System.out.println(bb);

        bb.account.balance = 1200;

        tp.account.withdraw(34);
        System.out.println(tp);
        tp.account.withdraw(999);
        // System.out.println(tp);

        System.out.println(b.getClientById(1));

        b.getBankBalance(); // het woord "Bank" vind ik hier overbodig. je roept het aan op een bank, dus het is al van de bank.
        b.printBankBalance(); // idem

        tp.account.transfer(bb.account, 20);
        System.out.println(bb);


    }

}
