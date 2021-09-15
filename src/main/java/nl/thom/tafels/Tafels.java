package nl.thom.tafels;

import java.util.Scanner;

public class Tafels {
    public static void main(String[] args) {
        int n = Integer.parseInt(getNumber()); // input > int
        int line = 1;
        int table = n;
        while (line <= 10) {
            System.out.printf("%s %s %s = %s\n", line, '\u00d7', table, line*table);
            line++;
            n++;
        }
        //printTableLine(n);

    }

    private static void printTableLine(int n) {

    }

    private static String getNumber() throws NotANumberException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int tried = 0;
        while (!sc.hasNextInt()) {
            tried++;
            if (tried == 3) {
                throw new NotANumberException("Ik stop ermee!");
            }
            System.out.println("No, no, numbers only!");
            System.out.print("Enter number: ");
            sc.next();
        }
        return sc.next();
    }
}
