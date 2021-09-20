package nl.thom.h5;

public class Fibo {
    static void printList(long[] a) {
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index]+ " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        long q = run(4, 5, 6);
        System.out.println(q);
        goldenRatio(92); // MAX
        printList(runFib(13));
    }

    static void run(int n) {
        run(1, 8);
    }

    static void run(int start, int n) {
        run(start, start, n);

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

    static long[] runFib (int n) {
        long[] fib = new long[n];
        fib[0] = 1;
        fib[1] = 1;

        long a = 1;
        long b = 1;
        long c;
        for (int i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            fib[i] = c;
        }
        return fib;
    }

    static void goldenRatio(int n) {
        System.out.println(
                (float) run(1, 1, n) / (float) run(1, 1, n - 1));
    }
}

