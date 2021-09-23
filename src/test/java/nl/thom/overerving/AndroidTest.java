package nl.thom.overerving;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AndroidTest {

    @Test
    public void dezeTest() {
        Android a = new Android("T1000", 84, 33);
        assertEquals(33, a.level);
    }

    @Test
    public void getAndroidGreetings() {
        Android a = new Android("T1000", 84, 33);
        assertTrue(a.greet().contains("I'm only half human, but human still... My energy level is 33%"));
    }

}