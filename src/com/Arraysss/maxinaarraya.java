package com.Arraysss;

import java.util.*;

public class maxinaarraya {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar[] = new int[n];
        int maximum = max(ar);
        System.out.println(maximum);
    }

    public static int max(int ar[]) {

        int maxi = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > ar[maxi]) {
                maxi = i;
            }
        }
        return maxi;
    }
}
