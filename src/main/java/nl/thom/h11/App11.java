package nl.thom.h11;

public class App11 {
    public static void main(String[] args) {
        Person p = new Person("Q", 2);
        p.addHistory("Joopie");
        p.addHistory("Peertje");
        System.out.println(p);
        System.out.println(p.records);

        Human h = new Person().createSubHuman();
        System.out.println(h.greet());

    }
}

