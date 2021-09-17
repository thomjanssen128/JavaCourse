package nl.thom.h4;

import java.util.Scanner;

public class ScannerTestWrapper {
    private Scanner scanner = new Scanner(System.in);


    public String nextLine() {
        return scanner.nextLine();
    }
}
