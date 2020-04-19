package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class binarysearch {
    public static void main(String[] args) {
        int array[] = {1, 2, 5, 36, 56, 45, 12, 53, 12, 11, 51, 55, 52, 58, 59, 5, 35, 25,};
        System.out.println(BinarySearch(array, 55));
    }

    public static int BinarySearch(int ar[], int item) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
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
