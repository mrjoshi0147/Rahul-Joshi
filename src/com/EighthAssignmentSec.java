package com;

import java.util.*;

public class EighthAssignmentSec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int k = 0;
        while (row <= n) {
            int col = 1;
            while (col <= row) {
                System.out.print(col);
                col = col + 1;

            }

            System.out.println();
            row = row + 1;
        }
    }
}