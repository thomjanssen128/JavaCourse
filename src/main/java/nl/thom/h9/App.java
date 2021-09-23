package nl.thom.h9;

public class App {

    public static void main(String[] args) {
        Bank b = new Bank();
        Account a = new Account("1234", 234);
        b.addAccount(a);
        System.out.println(b);
        Account n = new Account("1234", 2334);
        b.addAccount(a);
        System.out.println(b);



    }
}
