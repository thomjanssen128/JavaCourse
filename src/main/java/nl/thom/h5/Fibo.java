package nl.thom.h5;

public class Fibo {
    public static void main(String[] args) {
        long q = run(4, 5, 6);
        System.out.println(q);
        goldenRatio(92); // MAX
    }

    static void run(int n) {
        run(1,8);
    }

    static void run(int start, int n) {
        run(start, start,n);

    }

    static long run(int f1, int f2, int n) {
        System.out.print(f1 + " ");
        long a = f1;
        long b = f2;
        long c;
        for (int i = 0; i < n - 1; i++) {
            c = a + b;
            System.out.print(b + " ");
            a = b;
            b = c;
        }
        System.out.print("\n");

        return a;
    }

    static void goldenRatio(int n) {
        System.out.println(
                (float)run(1,1,n) / (float)run(1,1,n-1));
    }
}

