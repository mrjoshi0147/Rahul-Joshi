package com.company;

import java.rmi.dgc.VMID;
import java.util.*;
import java.util.Arrays;

public class Searching {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ar[] = {1, 2, 3, 4, 5};
        int element = 5;

        System.out.println((Binary(ar, 5)));
    }

    public static int Binary(int ar[], int element) {
        int start = 0;
        int end = ar.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ar[mid] == element) {
                return mid;
            } else if (element > ar[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;


    }

}
