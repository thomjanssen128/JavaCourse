package nl.thom.h7;

import nl.thom.Gender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

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

    @Test
    public void toStringTest() {
        Person p = new Person("Jaap", 78);
        assertEquals("Jaap (78) is UNKNOWN", p.toString());
    }

    @Test
    public void hashCodeEqualTest() {
        Person p = new Person("Jaap", 78);
        Person q = new Person("Jaap", 78);
        assertEquals(p.hashCode(), q.hashCode());
    }

    @Test
    public void hashCodeNotEqualTest() {
        Person p = new Person("Jaap", 78);
        Person q = new Person("Jaap", 88);
        assertNotEquals(p.hashCode(), q.hashCode());
    }
}