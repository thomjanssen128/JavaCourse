package nl.thom.h4;


import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ElevenProofTest {

    private ElevenProof target;
    // private final ScannerTestWrapper mockScanner = mock(ScannerTestWrapper.class);
    private Scanner mockScanner;

    @Before
    public void setUp() {
        this.target = new ElevenProof();
        // this.target.setScannerWrapper(mockScanner);
        mockScanner = mock(Scanner.class);
        target.setScanner(mockScanner);

        when(mockScanner.nextLine()).thenReturn("123456789");
    }

    @Test
    public void getNumberTest() {
        when(mockScanner.nextLine()).thenReturn("123456789");
        System.out.println(target.getNumber());
    }

    @Test
    public void getElevenSumFromStringAccountTest() {
        String accountNumber = "123456789";
        int total = ElevenProof.getElevenSum(accountNumber);
        assertEquals(165, total);
    }

    @Test
    public void validationNumberSuccessTest() {
        int total = 165;
        assertTrue(ElevenProof.validationNumber(total));
    }

    @Test
    public void validationNumberFailTest() {
        int total = 166;
        assertFalse(ElevenProof.validationNumber(total));

    }

}