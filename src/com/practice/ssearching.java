package com.practice;

import java.util.*;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class ssearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println(binarySearch(array, 55));


    }

    public static int binarySearch(int ar[], int item) {
        int low = 0;
        int high = ar.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (item > ar[mid]) {
                low = mid + 1;
            } else if (item < ar[mid]) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
