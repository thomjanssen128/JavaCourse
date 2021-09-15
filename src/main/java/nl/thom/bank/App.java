package nl.thom.bank;

public class App {
    public static void main(String[] args) {
        Bank b = new Bank();
        System.out.println('\u00d7');
        Client tp = b.makeNewClient("Tom", "Poes", 234);
        Client bb = b.makeNewClient("Bulle", "Bas");

        System.out.println(tp);
        System.out.println(bb);

        bb.account.balance = 1200;

        tp.account.withdraw(34);
        System.out.println(tp);
        tp.account.withdraw(999);
        //        System.out.println(tp);

        System.out.println(b.getClientById(1));

        b.getBankBalance();
        b.printBankBalance();

        tp.account.transfer(bb.account, 20);
        System.out.println(bb);


    }

}
