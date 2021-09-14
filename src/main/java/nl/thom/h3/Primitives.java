package nl.thom.h3;

import static java.lang.Math.pow;

public class Primitives {
    public static void main(String[] args) {
        final int BITS_BYTE = 1 * 8;
        final int BITS_SHORT = 2 * 8;
        final int BITS_INT = 4 * 8;
        final int BITS_LONG = 8 * 8;
        final int BITS_DOUBLE = 8 * 8;
        final int BITS_FLOAT = 4 * 8;
        final int BITS_CHAR = 2 * 8;

        byte byteMin = (byte) -(pow(2, BITS_BYTE - 1));
        byte byteMax = (byte) (pow(2, BITS_BYTE - 1) - 1);
        short shortMin = (short) -(pow(2, BITS_SHORT - 1));
        short shortMax = (short) (pow(2, BITS_SHORT - 1) - 1);
        int intMin = (int) -(pow(2, BITS_INT - 1));
        int intMax = (int) (pow(2, BITS_INT - 1) - 1);
        long longMin = (long) -(pow(2, BITS_LONG - 1));
        long longMax = (long) (pow(2, BITS_LONG - 1) - 1);
        double doubleMax = (double) (pow(2, BITS_DOUBLE - 1) - 1);
        double doubleMin = (double)-(pow(2, BITS_DOUBLE - 1));
        float floatMax = (float) (pow(2, BITS_FLOAT - 1) - 1);
        float floatMin = (float)-(pow(2, BITS_FLOAT - 1));

        char charMin = (char) 0; // er zijn geen negatieve waardes in unicode
        char charMax = (char) (pow(2, BITS_CHAR) - 1);


        System.out.println(byteMin);
        System.out.println(byteMax);
        System.out.println(shortMin);
        System.out.println(shortMax);
        System.out.println(intMin);
        System.out.println(intMax);
        System.out.println(longMin);
        System.out.println(longMax);
        System.out.println('d' + doubleMin);
        System.out.println(doubleMax);
        System.out.println(floatMin);
        System.out.println(floatMax);
        System.out.println(charMin);
        System.out.println(charMax);
        System.out.println((int) charMin);
        System.out.println((int) charMax);
    }
}
