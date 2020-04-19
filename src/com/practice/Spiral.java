package com.practice;

import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;

public class Spiral {
    public static void main(String[] args) {
        int[][] ar = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        Arrays(ar);
    }

    public static void Arrays(int ar[][]) {
        int top = 0;
        int bottom = ar.length - 1;
        int left = 0;
        int right = ar[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.println(ar[top][i]);
            }
            top++;
            for (int j = top; j <= bottom; j++) {
                System.out.println(ar[j][right]);
            }
            right--;
            for (int i = right; i >= left; i--) {
                System.out.println(ar[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                System.out.println(ar[i][left]);
            }
            left++;
        }
    }
}
