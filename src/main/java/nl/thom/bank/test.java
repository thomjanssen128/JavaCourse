package nl.thom.bank;

public class test {
    public static void main(String[] args) {
        Bank b = new Bank();
        Client tp = b.makeNewClient("Tom", "Poes", 234);
        Client bb = b.makeNewClient("Bulle", "Bas");

        System.out.println(tp);
        System.out.println(bb);

        bb.account.balance = 1200;

        tp.account.withdraw(34);
        System.out.println(tp);
        //        tp.account.withdraw(999);
        //        System.out.println(tp);

        System.out.println(b.getClientById(1));

        b.printBankBalance();

    }

}
