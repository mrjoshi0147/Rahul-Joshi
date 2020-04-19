package com.Assignment4;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        int array[] = {20, 30, 45, 65, 42};
        System.out.println("The maximumm number is " + maxinArray(array));

    }

    public static int maxinArray(int ar[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }

        }
        return max;
    }
}
