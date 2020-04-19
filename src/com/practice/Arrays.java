package com.practice;

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int ar[] = null;
        ar = new int[5];
        ar[1] = 10;
        ar[2] = 20;
        ar[3] = 30;
        ar[4] = 40;
//
//        System.out.println(ar);
//        for (int i = 0; i < ar.length; i++) {
//            System.out.println(ar[i]);
//        }
//
//        for (int val : ar) {
//            System.out.println(val);
//        }
        int i = 0;
        int j = 2;
//        System.out.println(ar[i]+"," + ar[j]);
        swapping(ar, i, j);
        System.out.println(ar[i] + "," + ar[j]);

//        System.out.println(ar[i] + ", " + ar[j]);
//        swapping(ar, i , j);
//        System.out.println(ar[i]+"," + ar[j]);

    }

    public static void swapping(int ar[], int i, int j) {

//            System.out.println(ar[i]+"," + ar[j]);

        int temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
        System.out.println(ar[i] + "," + ar[j]);
    }
}
