package com.company;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayseg {
    public static void main(String[] args) {


        int ar[] = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < ar.length; i++) {

            System.out.println(ar[i]);
            i = i++;

        }
//        System.out.println(Arrays.toString(ar));
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }


    }
}
