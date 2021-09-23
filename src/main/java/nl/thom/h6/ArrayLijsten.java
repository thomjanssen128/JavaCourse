package nl.thom.h6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayLijsten {
    private Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        new ArrayLijsten().start();
    }

    public void start() {
        long[] row = new long[4];
        row[2] = 3;
        long[] copy = row;
        copy[2]++;
        /*
        row[2] moet nu 4 zijn
        copy == row
        */
        // System.out.println(row[2]);
        // // row[4] is boundOfBounds
        //
        // long[] lijstje = {1, 2, 3, 4};
        // long[] twee = verdubbelaar(lijstje);
        // printList(twee);
        // multiply(twee, 2);
        // printList(twee);
        // long[] cn = consoleNummers();
        // printList(cn);
        // long[] metSum =sumOfNums(cn);
        // printList(metSum);
        printSudoku(sudoku());


    }

    void printList(long[] a) {
        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index] + " ");
        }
        System.out.println("");
    }

    public long[] verdubbelaar(long[] lijst) {
        int tweeKeer = lijst.length * 2;
        long[] tweekeerLijst = new long[tweeKeer];
        for (int index = 0; index < lijst.length; index++) {
            tweekeerLijst[index] = lijst[index];
        }
        return tweekeerLijst;

    }

    void multiply(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] *= multiplier;
        }
    }

    long[] runFib(int n) {
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

    long[] consoleNummers() {
        String stringNums = s.nextLine();
        String[] splitArray = stringNums.split(" ");
        long[] array = new long[splitArray.length];
        for (int i = 0; i < splitArray.length; i++) {
            array[i] = Integer.parseInt(splitArray[i]);
        }
        return array;
    }

    long[] sumOfNums(long[] l) {
        long s = Arrays.stream(l).sum();
        long[] newList = new long[l.length + 1];
        System.arraycopy(l, 0, newList, 0, l.length);
        newList[l.length] = s;

        return newList;
    }

    ArrayList<Integer> randomEenTotNegen() {
        ArrayList<Integer> base = new ArrayList<>();
        for (int i = 1; i < 10; i++) {
            base.add(i);
        }
        Collections.shuffle(base);
        System.out.println(base);
        return base;
    }

    int[][] sudoku() {
        ArrayList<Integer> base = randomEenTotNegen();
        int[][] grid = new int[3][3];
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[x][y] = base.remove(0);
            }

        }
        return grid;
    }

    void printSudoku(int[][] grid) {

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 3; x++) {
                System.out.print("| "+grid[x][y] + " ");
            }
            System.out.println("|");
        }
        System.out.println();

        // System.out.println(grid[2][1]);
    }
}
