package com.Assignment4;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Question2 {
    public static void main(String[] args) {
        int ar[] = {10, 20, 50, 45, 30};
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
