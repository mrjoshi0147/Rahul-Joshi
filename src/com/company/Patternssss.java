package com.company;

import java.util.*;

public class Patternssss {
    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n=sc.nextInt();
        int n = 5;
        int row = 1;
        int k = 1;
        while (k <= 2 * n - 1) {
            int space = 1;
            while (space <= n - row) {
                System.out.print("*");
                space = space + 1;
            }
            int col = 1;
            while (col <= 2 * row + 1) {
                System.out.print("");
                col = col + 1;
            }
            System.out.println();
            if (k < n) {
                row = row + 1;
            } else {
                row--;
            }
            k = k + 1;
        }

    }
}

