package nl.thom.h3;

public class PlusPlus {
    public static void main(String[] args) {
        int a = 40;  // a=40
        int b = a++; // b=a   a++  b=40 a=41
        int c = ++a; // a++        a=42 c=a

        System.out.printf("%d %d %d", a, b, c);
    }
}