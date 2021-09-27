package nl.thom.overerving;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AndroidTest {
    // given / when / then

    @Test
    public void chargeIncreasesLevel() {
        Android a = new Android("T1000", 84, 33);
        int level = a.charge(30);
        assertEquals(63, level);
    }

    @Test
    public void levelPlusChargeAmountIsAbove100GetsIgnored() {
        Android a2 = new Android("T1000", 84, 50);
        int level2 = a2.charge(51);
        assertEquals(50, level2);
    }

    @Test
    public void androidGreetContainsLevel() {
        Android a = new Android("T1000", 84, 33);
        assertTrue(a.greet().contains("I'm only half human, but human still... My energy level is 33%"));
    }

}