package com.practice;

import java.util.*;
import java.util.Arrays;

public class arraysoperations {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = takeinput();
        display(array);

    }

    public static int[] takeinput() {
        System.out.println("  size ?");
        int n = sc.nextInt();
        int ar[] = new int[5];
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Enter the value for " + i + " index?");
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    public static void display(int ar[]) {

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

}
