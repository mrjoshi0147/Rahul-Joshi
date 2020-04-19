package com.company;

import java.util.*;

public class Pattern4 {
    public static void main(String[] args) {
//diamond pattern hai
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        n = n / 2 + 1;
        int k = 1;
        int row = 1;

        while (k <= 2 * n - 1) {

            int col = 1;
            int space = 1;

            while (space <= n - row) {
                System.out.print(" ");
                space = space + 1;
            }

            while (col <= 2 * row - 1) {
                System.out.print("*");
                col = col + 1;
            }


            System.out.println();
            if (k < n) {
                row = row + 1;
            } else {

                row = row - 1;
            }

            k = k + 1;

        }
    }
}

