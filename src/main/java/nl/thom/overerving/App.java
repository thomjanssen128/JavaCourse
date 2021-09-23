package nl.thom.overerving;

public class App {

    public static void main(String[] args) {
        Person p = new Person("T", 33);
        Person q = new Person("Q", 23);
        Android a = new Android("Data", 453, 48);
        Employee e = new Employee("N", 47);
        Teacher t = new Teacher("Bram", 42);

        System.out.println(p.greet());
        System.out.println(q.greet());
        System.out.println(a.greet());
        System.out.println(e.greet());
        System.out.println(t.greet());

        System.out.println(a);
        a.charge(20);
        System.out.println(a);
    }

}
