package nl.thom.h5;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MathThings {
    static int greatest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    static String greatest(String a, String b) {
        if (a.length() > b.length()) {
            return a;
        } else {
            return b;
        }
    }

    static int greatestL(int... ints) {
        return Arrays.stream(ints).max().getAsInt();
    }

    static int factorial2(int i) {
        int result = 1;
        for (int f = i; f > 1; f--) {
            result *= f;
        }
        return result;
    }

    static int factorial(int result, int i) {

        result *= i;
        if (i > 1) {
            i--;
            System.out.printf("%s %s\n", result, i);

            factorial(result, i);
        }
        return result;
    }

    static int factorialRecursion(int i) {
        if (i == 1 || i == 0) return 1;
        return i * factorialRecursion(i-1);
    }

    static double average(double... nummers) {
        return Arrays.stream(nummers).average().orElse(0);
    }

}
