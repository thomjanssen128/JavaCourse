package nl.thom.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class BankTest {
    Bank targetBank;

    @BeforeEach
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

            bank1.makeNewClient("Hocus", "Pas", 11);
        }
        ArrayList<Integer> ids = bank1.getAllClientIds();
        assertEquals(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14), ids);
    }


    @Test
    public void getClientByIdTest() {
        Bank bank2 = new Bank();
        bank2.makeNewClient("Hocus", "Pas", 1);      // id 0
        bank2.makeNewClient("Tom", "Poes", 2);       // id 1
        bank2.makeNewClient("Olivier", "Bommel", 3); // id 2
        Client bommel = bank2.getClientById(2);
        //        System.out.println(bank2.getBankBalance());
        assertEquals(2, bommel.id);
    }

    @Test
    public void generateTwoAccountsWithBalance10EachGetBankBalance() {
        Bank bankTestBalance = new Bank();

//        bankTestBalance.makeNewClient("Hocus", "Pas", 10);      // 0
//        bankTestBalance.makeNewClient("Tom", "Poes", 10);       // 1

        Client c1 = mock(Client.class);
        Client c2 = mock(Client.class);

        int bankBalance = (int) bankTestBalance.getBankBalance();
        assertEquals(20, bankBalance);
    }
}