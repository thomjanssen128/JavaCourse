package nl.thom.h4;

import java.util.Scanner;

public class ElevenProof {
    public static void main(String[] args) {

        String accountNumber = getNumber();
        int multiplier = 9;
        int total = 0;
        //        for (int i = 0; i < accountNumber.length(); i++){
        //            char c = accountNumber.charAt(i);
        //            System.out.println(c);
        //        }
        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(accountNumber.charAt(i));

            total += digit * multiplier;
            System.out.println("d: " + digit + " m: " + multiplier + " t: " + total);
            multiplier--;
        }
        System.out.println("total: " + total);
        validationNumber(total);


    }

    public static void validationNumber(int number) throws IllegalArgumentException {
        System.out.println(number);
        if (number % 11 != 0) {
            System.out.println(number % 11);
            throw new IllegalArgumentException("Niet deelbaar door 11");
        } else {
            System.out.println("Goed nummer!");
        }

    }

    private static String getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number, nine digits: ");
        //        while (!sc.hasNextInt()) {
        //            System.out.println("No, no, an account number, numbers only!");
        //            System.out.print("Enter account number, nine digits: ");
        //            sc.next();
        //        }
        //        while (sc.next().length() != 9) {
        //            System.out.println("I need nine digits. Like: 123456789");
        //            System.out.print("Enter account number, nine digits: ");
        //            //sc.next();
        //
        //        }
        String accountNumber = sc.next();
        System.out.println(accountNumber);

        return accountNumber;

    }

}
