package com.recursion;

import com.practice.Util;

import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
        int ar[] = {44, 33, 22, 11};
        BUbbleSort(ar, ar.length - 1, 0);
        System.out.println(Arrays.toString(ar));
    }

    public static void BUbbleSort(int ar[], int i, int j) {
        if (i == 0) {
            return;
        }
        if (i == j) {
            BUbbleSort(ar, i - 1, 0);
            return;
        }
        if (ar[j] > ar[j + 1]) {
            Util.swap(ar, j, j + 1);
        }
        BUbbleSort(ar, i, j + 1);

    }
}
