package nl.thom.h4;

import java.util.Scanner;

public class ElevenProof {

    private Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        new ElevenProof().start();
    }

    private void start() {
        String accountNumber = getNumber();
        int total = getElevenSum(accountNumber);

        System.out.println("total: " + total);
        System.out.println("Dit nummer is " + (validationNumber(total) ? "\033[92mwel \033[0m": "\033[91mniet \033[0m") + "ElevenProof.");


    }

    public static int getElevenSum(String accountNumber) {
        int multiplier = 9;
        int total = 0;

        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(accountNumber.charAt(i));

            total += digit * multiplier;
            // System.out.println("d: " + digit + " m: " + multiplier + " t: " + total);
            multiplier--;
        }
        return total;
    }

    public static boolean validationNumber(int number) {
        System.out.println(number);
        return number % 11 == 0;

    }

    // public void setScannerWrapper(Scanner scannerWrapper) {
    //     this.scannerWrapper = scannerWrapper;
    // }

    String getNumber() {
        //Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number, nine digits: ");
        //                while (!sc.hasNextInt()) {
        //                    System.out.println("No, no, an account number, numbers only!");
        //                    System.out.print("Enter account number, nine digits: ");
        //                    sc.next();
        //                }
        //                while (sc.next().length() != 9) {
        //                    System.out.println("I need nine digits. Like: 123456789");
        //                    System.out.print("Enter account number, nine digits: ");
        //                    sc.next();
        //
        //                }
        String accountNumber = scanner.nextLine();
        System.out.println(accountNumber);

        return accountNumber;



    }
    void setScanner(Scanner scanner){
        this.scanner = scanner;
    }

}
