package com.Patternss;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while (i <= n) {
            int col = 1;
            while (col <= i) {
                System.out.print("*");
                col = col + 1;
            }
            System.out.println();
            i = i + 1;
        }


    }
}
