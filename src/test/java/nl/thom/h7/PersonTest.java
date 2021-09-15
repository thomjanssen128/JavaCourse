package nl.thom.h7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void makePersonWithNameTest() {
        Person p = new Person("Jan", 12);
        assertEquals("Jan", p.name);

    }
    @Test
    public void makePersonWithAgeTest() {
        Person p = new Person("Joop", 34);
        assertEquals(34, p.getAge());

    }

    @Test
    public void haveBirthdayTest() throws PersonDiedException {
        Person p = new Person("Jaap", 56);
        p.haveBirthday();


    }

    @Test
    public void getGender() {
    }

    @Test
    public void setGender() {
        Person p = new Person("Jaap", 78);
        p.setGender(Gender.X);
        assertEquals(Gender.X, p.getGender());

    }



    @Test
    public void setAgeTest() {
        Person p = new Person("Jaap", 78);
        p.setAge(25);
        assertEquals(25, p.getAge());

    }
}