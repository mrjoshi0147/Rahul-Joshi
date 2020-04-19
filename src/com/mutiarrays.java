package com;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class mutiarrays {
    public static void main(String[] args) {
        int ar[][] = {{1, 2, 3}, {6, 5, 4}, {7, 8, 9}};
//        Scanner sc=new Scanner(System.in);
//
//        for (int i=0; i<ar.length; i++){
//             for (int j = 0; j <ar[i].length ; j++) {
//                System.out.println(ar[i] [j]);
//
//        ar[i] [j]= sc.nextInt();
//            }
//        }
    }

    public static void wave(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < ar[i].length; j++) {
                    System.out.println(ar[i][j]);
                }
            } else {
                for (int j = ar[i].length - 1; j >= 0; j++) {

                    System.out.println(ar[i][j]);
                }
            }
        }
    }
}
