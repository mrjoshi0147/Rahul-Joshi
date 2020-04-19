package com;

import java.util.*;

public class AssignmentSecondKaSeventh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int k = 1;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print("  " + k);
                col = col + 1;
                k = k + 1;
            }
            System.out.println();


            row = row + 1;
        }

    }
}
