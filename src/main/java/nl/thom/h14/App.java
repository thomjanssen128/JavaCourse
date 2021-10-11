package nl.thom.h14;

import nl.thom.Gender;

public class App {


    public static void main(String[] args) {
        House h = new House();
        Person p = new Person("Joop", 34, Gender.MALE);
        Android a = new Android("Data", 2,23);
        String s = new String();

        h.content.add(p);
        h.content.add(a);

        System.out.println(h);

    }
}
