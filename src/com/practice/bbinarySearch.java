package com.practice;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class bbinarySearch {
    public static void main(String[] args) {
        int[] array = {5, 7, 10, 12, 15, 20, 27, 31, 36, 42, 55, 58, 60, 65, 70, 80};
        System.out.println(binarySearch(array, 55));
    }

    public static int binarySearch(int ar[], int item) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (ar[mid] < item) {
                low = mid + 1;
            } else if (ar[mid] > item) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
