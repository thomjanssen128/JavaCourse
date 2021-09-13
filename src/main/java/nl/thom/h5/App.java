package nl.thom.h5;

import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println(MathThings.greatest(1, 2));
        System.out.println(MathThings.greatest("Thom", "Janssen"));
        System.out.println(MathThings.greatestL(23,45,67,23));
        System.out.println(MathThings.factorial(1,8));
        System.out.println(MathThings.factorial2(8));
    }
}
