package nl.thom.h3;

public class WhatAboutJ {
    public static void main(String[] args) {
        int a = 42;
        System.out.println(a >>> 1);
        //The difference between >> and >>>
        // would only show up when shifting
        // negative numbers. The >> operator
        // shifts a 1 bit into the most
        // significant bit if it was a 1, and
        // the >>> shifts in a 0 regardless.


        int i = 2;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        /*

        if i kleiner dan 3 dan i++ + ++i,
        else ++i >>> 1

        j = i , dan i+1, dan j + (i+1)
            2        3       2 + 4 = 6

        */
        System.out.printf("i = %d, j = %d", i, j);
    }
}
