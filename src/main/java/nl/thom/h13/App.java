package nl.thom.h13;

import nl.thom.Gender;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.message.EntryMessage;
import org.apache.logging.log4j.message.Message;
import org.apache.logging.log4j.message.MessageFactory;
import org.apache.logging.log4j.util.MessageSupplier;
import org.apache.logging.log4j.util.Supplier;

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
