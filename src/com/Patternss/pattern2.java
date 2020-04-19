package com.Patternss;

import java.util.*;

public class pattern2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int space = 1;
        int k = 1;
        int row = 1;
        while (k <= 2 * N - 1) {

            while (space <= 2 * N - row) {
                System.out.println("");
                space = space + 1;
            }
            int col = 1;
            while (col <= 2 * row - 1) {
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
