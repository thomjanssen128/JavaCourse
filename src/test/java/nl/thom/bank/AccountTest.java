package nl.thom.bank;


import nl.thom.bank.exceptions.InsufficientFundsException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class AccountTest {
//    Account targetAccount;
//
//    @BeforeEach
//    public void setUp() {
//        targetAccount = new Account();
//    }

//    @Test
//    public void

    @Test
    public void makeAccountWithBalanceTest() {
        Account a = new Account(23);
        assertEquals(23.0, a.balance);
    }

    @Test
    public void withdrawSuccessfulTest() {
        Account a = new Account(12);
        a.withdraw(10);
        assertEquals(2, a.balance);
    }

    @Test
    public void withdrawUnsuccessfulTest() {
        Account u = new Account(12);
        Exception exception = assertThrows(InsufficientFundsException.class,() -> {
            // something goes wrong
            u.withdraw(13);
        });
        String expectedMessage = "Not enough money in your account.";
        String actualMessage = exception.getMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void tranferToTest() {
        Account from = new Account(100);
        Account to = new Account(30);
        from.transfer(to, 70);
        assertEquals(100, to.balance);

    }
    @Test
    public void tranferFromTest() {
        Account from = new Account(100);
        Account to = new Account(30);
        from.transfer(to, 70);
        assertEquals(30, from.balance);

    }
}