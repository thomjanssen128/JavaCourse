package nl.thom.overerving;

public class App {

    public static void main(String[] args) {
        // Conreet c = new Conreet("thom");
        // Conreet j = new Conreet("joop");
        // System.out.println(c.hallo());
        // System.out.println(j.hallo());
        Person p = new Person("T", 33);
        Person q = new Person("Q", 23);
        Android a = new Android("Data", 453);
        Employee e = new Employee();

        System.out.println(p.greet());
        System.out.println(q.greet());
        System.out.println(a.greet());
        System.out.println(e.greet());
    }

}
