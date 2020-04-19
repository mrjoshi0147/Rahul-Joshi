package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class RotationOfArrays {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        int k = 2;
        reverse(ar, 0, 2);
        System.out.println(Arrays.toString(ar));
        reverse(ar, k, ar.length - 1);
        System.out.println(Arrays.toString(ar));
        reverse(ar, 0, ar.length - 1);
        System.out.println(Arrays.toString(ar));
    }

    public static void reverse(int ar[], int start, int end) {

        while (start <= end) {
            int temp = ar[start];
            ar[start] = ar[end];
            ar[end] = temp;

            start++;
            end--;
        }
    }
}
