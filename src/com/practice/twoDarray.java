package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class twoDarray {

    public static void main(String[] args) {
        int ar[][] = new int[3][3];
//        System.out.println(ar[0][0]);
        ar[0][0] = 20;
        ar[2][1] = 23;
//        System.out.println(ar[0][0]);
//        System.out.println(ar[2][1]);
        Display(ar);
    }

    public static void Display(int ar[][]) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                System.out.print(ar[i][j] + "     ");
            }
            System.out.println("     ");
        }
    }

}
