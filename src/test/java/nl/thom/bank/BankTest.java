package nl.thom.bank;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BankTest {
    Bank targetBank;

    @Before
    public void setUp() {
        targetBank = new Bank();

    }
    //    @Test
    //    public void makeClientWithFirstAndLastName() {
    //        String firstName = "Hiep";
    //        String lastName = "Hieper";
    //        Client hh = new Client(firstName, lastName, 33);
    //        assertEquals("HiepHieper", hh.firstName + hh.lastName);
    //    }


    @Test
    public void make15ClientsAndGetIdNumbersZeroToFourteen() {
        // test getAllClientIds
        Bank bank1 = new Bank();
        for (int id = 0; id < 15; id++) {

            ;
        }
        ArrayList<Integer> ids = bank1.getAllClientIds();
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), ids);
    }


    // @Test
    // public void getClientByIdTest() {
    //     targetBank.makeNewClient("Hocus", "Pas", 1);      // id 0
    //     targetBank.makeNewClient("Tom", "Poes", 2);       // id 1
    //     targetBank.makeNewClient("Olivier", "Bommel", 3); // id 2
    //     Client bommel = targetBank.getClientById(2);
    //     //        System.out.println(bank2.getBankBalance());
    //     assertEquals(2, bommel.id);
    // }

    @Test
    public void generateTwoAccountsWithBalance10EachGetBankBalance() {
        Account a1 = mock(Account.class);
        Account a2 = mock(Account.class);

        // a1.balance = 10;
        // a2.balance = 10;
        // dit werkt ook

        Client c1 = mock(Client.class);
        Client c2 = mock(Client.class);
        //
        // c1.account = a1;
        // c2.account = a2;

        targetBank.addClient(c1);
        targetBank.addClient(c2);


        // when(c1.account.getBalance()).thenReturn(10d);
        // when(c2.account.getBalance()).thenReturn(10d);
        // ^ dit moet een functie zijn! niet een field!

        // System.out.println(targetBank.clients.get(0).account.balance);

        int bankBalance = (int) targetBank.getBankBalance();
        assertEquals(20, bankBalance);
    }
}