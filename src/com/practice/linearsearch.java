package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class linearsearch {
    public static void main(String[] args) {

        int ar[] = {20, 30, 25, 50, 16};
        System.out.println(linearSearch(ar, 50));
    }

    public static int linearSearch(int ar[], int item) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == item) {
                return i;
            }

        }
        return -1;
    }
}
