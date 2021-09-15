package nl.thom.h4;

import java.util.Scanner;

public class Hourglass {
    public static void main(String[] args) throws EvenNumberException, DigitsExeption {
        int n = Integer.parseInt(getNumber()); // input > int
        if (n % 2 == 0) {
            throw new EvenNumberException("Even numbers are not allowed!");
        }
        drawHourglass(n);
    }

    private static String getNumber() throws DigitsExeption {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int tried = 0;
        while (!sc.hasNextInt()) {
            tried++;
            if (tried == 3) {
                throw new DigitsExeption("Ik stop ermee!");
            }
            System.out.println("No, no, numbers only!");
            System.out.print("Enter number: ");
            sc.next();
        }
        return sc.next();
    }

    private static void drawHourglass(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 | i == n - 1) {
                String top = new String(new char[n]).replace("\0", "*");
                System.out.println(top);
            } else {
                String laag = "";
                laag = laag + new String(new char[n]).replace("\0", " ");
                StringBuilder hourglass = new StringBuilder(laag);
                int index = n - i - 1;
                hourglass.setCharAt(index, '*');
                hourglass.setCharAt(i, '*');

                System.out.println(hourglass.toString());
            }

        }
    }
}
