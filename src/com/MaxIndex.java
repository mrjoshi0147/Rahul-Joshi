package com;

import java.util.*;
import java.util.Arrays;

public class MaxIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] ar = new int[length];

        int index = maximumindex(ar, 3, 1);
        System.out.println(index);
    }

    public static int maximumindex(int ar[], int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (ar[i] > ar[max]) ;
            max = 1;


        }
        return max;
    }
}
