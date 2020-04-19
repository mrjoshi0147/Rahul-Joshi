package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class maxinarray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int array[] = takeinput();
        display(array);
        int[] arrays = {20, 52, 40, 30, 10};
        System.out.println(arrays);
//        System.out.println("Maximum number is " +maxInArray(array) );
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

//
//
//
//    public static int maxInArray(int ar[]){
//
//        int max=Integer.MIN_VALUE;
//        for (int i = 0; i <ar.length; i++){
//
//            if (ar[i]> max){
//                max=ar[i];
//            }
//        }
//        return max;

}


