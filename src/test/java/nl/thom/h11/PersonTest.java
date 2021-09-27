package nl.thom.h11;

import nl.thom.Gender;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    private Person person;

    @Before
    public void setup() {
        person = new Person("Henny", 34, Gender.X);
    }

    @Test
    public void addingHistoryWillBeLastElementInRecords() {
        person.addHistory("a");
        person.addHistory("b");
        person.addHistory("c");
        // assertTrue( person.records.get(0));
    }

}